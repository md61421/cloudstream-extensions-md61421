# AnimeCat - CloudStream Extension

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/md61421/cloudstream-extensions-md61421)
[![CloudStream](https://img.shields.io/badge/CloudStream-Extension-blue)](https://cloudstream.cf/)
[![Language](https://img.shields.io/badge/language-Hindi-orange)](https://github.com/md61421/cloudstream-extensions-md61421)

A CloudStream extension that provides access to anime and cartoon content in Hindi language. This extension scrapes content from [WatchAnimeWorld](https://watchanimeworld.in) and makes it available through the CloudStream app.

## 🌟 Features

- **Multi-language Support**: Content available in Hindi
- **Multiple Content Types**: 
  - Anime Series
  - Anime Movies
  - Cartoon Series
  - Cartoon Movies
- **Comprehensive Categories**:
  - On-Air Shows
  - New Anime Arrivals
  - Latest Cartoon Series
  - Fresh Cartoon Films
  - Crunchyroll Content
- **Advanced Features**:
  - Search functionality
  - Episode management
  - Download support
  - Subtitle support
  - Cross-platform compatibility

## 📱 Installation

### Method 1: Direct Installation (Recommended)

1. Open CloudStream app
2. Go to **Settings** → **Extensions**
3. Add the following repository URL:
   ```
   https://raw.githubusercontent.com/md61421/cloudstream-extensions-md61421/builds/repo.json
   ```
4. Install the **AnimeCat** extension
5. Restart CloudStream

### Method 2: Manual Installation

1. Download the latest `.cs3` file from the [releases](https://github.com/md61421/cloudstream-extensions-md61421/releases)
2. Open CloudStream app
3. Go to **Settings** → **Extensions**
4. Click on **Install Extension** and select the downloaded `.cs3` file
5. Restart CloudStream

## 🚀 Usage

1. **Browse Content**: Navigate through different categories in the main page
2. **Search**: Use the search function to find specific anime or cartoons
3. **Watch**: Select any title to start streaming
4. **Download**: Use the download feature to save content for offline viewing

## 🛠️ Development

### Prerequisites

- Android Studio or IntelliJ IDEA
- Java 8 or higher
- Gradle 8.2.2 or higher
- Kotlin 2.1.0 or higher

### Building from Source

1. Clone the repository:
   ```bash
   git clone https://github.com/md61421/cloudstream-extensions-md61421.git
   cd cloudstream-extensions-md61421
   ```

2. Build the extension:
   ```bash
   ./gradlew assembleRelease
   ```

3. The built files will be available in the project root:
   - `AnimeCat.cs3` - CloudStream plugin file
   - `AnimeCat.jar` - JAR file

### Project Structure

```
cloudstream-extensions-md61421/
├── AnimeCat/                    # Main extension module
│   ├── src/main/kotlin/
│   │   └── com/md61421/
│   │       ├── AnimeCat.kt      # Main extension class
│   │       ├── AnimeCatParser.kt # Content parser
│   │       ├── AnimeCatProvider.kt # Content provider
│   │       └── Extractor.kt     # Video extractor
│   └── build.gradle.kts         # Module build configuration
├── build.gradle.kts             # Root build configuration
└── README.md                    # This file
```

## 📋 Requirements

- **CloudStream**: Version 3.0 or higher
- **Android**: API level 21+ (Android 5.0+)
- **Internet**: Stable internet connection for streaming

## 🔧 Configuration

The extension supports the following configuration options:

- **Language**: Hindi (hi)
- **Supported Types**: Anime, Cartoon, Movie
- **Status**: Active (1)
- **Cross-platform**: Yes

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### How to Contribute

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ⚠️ Disclaimer

This extension is for educational purposes only. Please respect copyright laws and support content creators by using legal streaming services when available.

---

**Made with ❤️ by [md61421](https://github.com/md61421)**
