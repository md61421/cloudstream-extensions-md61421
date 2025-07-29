// ----------------------------
// Imports must be at the top for Kotlin DSL
// ----------------------------
import org.gradle.api.tasks.bundling.Jar

version = 1

cloudstream {
    language = "hi"
    // All of these properties are optional, you can safely remove them

    description = "Anime/Cartoon in Hindi"
    authors = listOf("md61421")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "Cartoon"
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=anime.cat&sz=%size%"

    isCrossPlatform = true
}

// ----------------------------
// Required for AGP 8+
// ----------------------------
android {
    namespace = "com.md61421"
}

// ----------------------------
// Local build tasks for .cs3 + .jar
// ----------------------------

// ✅ Task to create the .cs3 file for Cloudstream
tasks.register<Zip>("buildPlugin") {
    group = "build"
    description = "Builds Cloudstream plugin as .cs3"

    // ✅ AGP 8+ stores AAR directly in outputs/aar/
    from(layout.buildDirectory.dir("outputs/aar")) {
        include("*-release.aar") // Only include release AAR
    }

    // Output file name and destination folder
    archiveFileName.set("${project.name}.cs3")
    destinationDirectory.set(layout.buildDirectory.dir("libs"))
}

// ✅ Task to create the .jar file for Cloudstream
tasks.register<Jar>("buildJar") {
    group = "build"
    description = "Builds Cloudstream plugin as .jar"

    // Include compiled Kotlin and Java class files
    from(layout.buildDirectory.dir("intermediates/javac/release/classes"))
    from(layout.buildDirectory.dir("tmp/kotlin-classes/release"))

    // Output file name and destination folder
    archiveFileName.set("${project.name}.jar")
    destinationDirectory.set(layout.buildDirectory.dir("libs"))
}

// ✅ Automatically create .cs3 and .jar after assembleRelease
afterEvaluate {
    tasks.named("assembleRelease").configure {
        finalizedBy("buildPlugin", "buildJar")
    }
}
