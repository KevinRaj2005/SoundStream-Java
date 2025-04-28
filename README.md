# 🎵 Console Music Player (Java)

## Description
This project is a simple **Console-based Music Player** built with **Java**.  
It allows users to select from various playlists (English, Hindi, Tamil, Marathi) and control the playback of `.wav` audio files with basic commands like Play, Stop, Reset, and Back — all from the command line interface.

Ideal for learning basic file handling, audio processing (`javax.sound.sampled`), and menu-driven programming in Java.

---

## Features
- 🎶 Multiple playlists categorized by language.
- ▶️ Play, Stop, and Reset songs.
- 🔄 Easy to navigate through playlists.
- 🎧 Supports `.wav` audio files.
- 🖥️ Simple and clean console UI.

---

## How to Run

1. **Prerequisites**  
   - Java JDK installed
   - `.wav` audio files corresponding to the playlists available in the project directory

2. **Compile the program**  
   ```bash
   javac MusicPlayer.java
   ```

3. **Run the Program**
   ```bash
   java MusicPlayer
   ```

4. **Controls**

  P: Play song
  S: Stop song
  R: Reset song
  B: Back to playlist menu
  Q: Quit the application

## Requirements

Java Development Kit (JDK) 8 or higher
.wav files for songs
Terminal/Command Prompt access

## Future Enhancements

Add support for MP3 format (using external libraries like JLayer).
Build a GUI using Java Swing or JavaFX.
Add pause and volume control features.
Dynamic loading of songs from folders instead of hardcoding.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
