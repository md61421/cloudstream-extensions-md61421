package com.md61421

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class AnimeCatProvider : BasePlugin() {
    override fun load() {
        // All providers should be added in this manner. Please don't edit the providers list
        // directly.
        registerMainAPI(AnimeCat())
        registerExtractorAPI(Pixdrive())
        registerExtractorAPI(Ghbrisk())
        registerExtractorAPI(AWSStream())
        registerExtractorAPI(Cybervynx())
    }
}
