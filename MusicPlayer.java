import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class MusicPlayer {

  public static void clear() {
    System.out.print("\033[H\033[2J");
  }

  public static void playSong(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner scanner = new Scanner(System.in);

    File file = new File(path);
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    String response = "";

    while (!response.equals("B")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("Now Playing :" + path);
      System.out.println("P = play, S = Stop, R = Reset, B = Back");
      System.out.print("Enter your choice: ");
      response = scanner.next();
      response = response.toUpperCase();
      switch (response) {
        case ("P"):
          clip.start();
          break;
        case ("S"):
          clip.stop();
          break;
        case ("R"):
          clip.setMicrosecondPosition(0);
          break;
        case ("B"):
          clip.close();
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

  public static void EnglishPlaylist() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner sc = new Scanner(System.in);
    String response = "";
    while (!response.equals("B")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("-----------------------English Playlist---------------------");
      System.out.println("1 - Alan Walker Alone");
      System.out.println("2 - See You Again");
      System.out.println("3 - MockingBird Eminem");
      System.out.println("4 - Starboy TheWeeknd");
      System.out.println("5 - God's Plan Drake");
      System.out.println("6 - Perfect Ed Sheeran");
      System.out.println("7- Shape of You");
      System.out.println("Enter B to Back");
      System.out.println("Enter Q to Quit");
      System.out.print("Enter Above Option: ");

      response = sc.next();
      response = response.toUpperCase();

      switch (response) {
        case ("1"):
          playSong("Alan_Walker_ Alone.wav");
          break;
        case ("2"):
          playSong("See_You_Again.wav");
          break;
        case ("3"):
          playSong("Mockingbird.wav");
          break;
        case ("4"):
          playSong("Starboy.wav");
          break;
        case ("5"):
          playSong("Gods_Plan.wav");
          break;
        case ("6"):
          playSong("Perfect.wav");
          break;
        case ("7"):
          playSong("Shape_of_you.wav");
          break;
        case ("B"):
          System.out.println("Back to Main Menu!");
          break;
        case ("Q"):
          System.out.println("Quiting. See you Again!");
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

  public static void HindiPlaylist() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner sc = new Scanner(System.in);
    String response = "";
    while (!response.equals("B")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("-----------------------Hindi PLaylist---------------------");
      System.out.println("1 - No Competition Jass Manak");
      System.out.println("2 - Maan Meri Jaan King");
      System.out.println("3 - Ek Din Pyaar MC STAN");
      System.out.println("4 - Tere Pyaar Mein");
      System.out.println("5 - Raataan Lambiyan");
      System.out.println("6 - Raat Bhar");
      System.out.println("7 - Kesariya");
      System.out.println("8 - Janam Janam");
      System.out.println("Enter B to Back");
      System.out.println("Enter Q to Quit");
      System.out.print("Enter Above Option: ");

      response = sc.next();
      response = response.toUpperCase();

      switch (response) {
        case ("1"):
          playSong("No_Competition.wav");
          break;
        case ("2"):
          playSong("Maan_Meri_Jaan.wav");
          break;
        case ("3"):
          playSong("Ek_Din_Pyaar.wav");
          break;
        case ("4"):
          playSong("Tere_Pyaar_Mein.wav");
          break;
        case ("5"):
          playSong("Raataan_Lambiyan.wav");
          break;
        case ("6"):
          playSong("Raat_Bhar.wav");
          break;
        case ("7"):
          playSong("Kesariya.wav");
          break;
        case ("8"):
          playSong("Janam_Janam.wav");
          break;
        case ("B"):
          System.out.println("Back to Main Menu!");
          break;
        case ("Q"):
          System.out.println("Quiting. See you Again!");
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

  public static void TamilPlaylist() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner sc = new Scanner(System.in);
    String response = "";
    while (!response.equals("B")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("-----------------------Tamil PLaylist---------------------");
      System.out.println("1 - Arabic Kuthu Anirudh");
      System.out.println("2 - Vaathi Coming Lokesh");
      System.out.println("3 - Bae (Don)");
      System.out.println("4 - Megham Karukatha");
      System.out.println("5 - Chellamma (Doctor)");
      System.out.println("6 - Maari");
      System.out.println("7 - Private Party");
      System.out.println("Enter B to Back");
      System.out.println("Enter Q to Quit");
      System.out.print("Enter Above Option: ");

      response = sc.next();
      response = response.toUpperCase();

      switch (response) {
        case ("1"):
          playSong("Arabic_Kuthu.wav");
          break;
        case ("2"):
          playSong("Vaathi_Coming.wav");
          break;
        case ("3"):
          playSong("Bae.wav");
          break;
        case ("4"):
          playSong("Megham_Karukatha.wav");
          break;
        case ("5"):
          playSong("Chellamma.wav");
          break;
        case ("6"):
          playSong("Maari.wav");
          break;
        case ("7"):
          playSong("Private_party.wav");
          break;
        case ("B"):
          System.out.println("Back to Main Menu!");
          break;
        case ("Q"):
          System.out.println("Quiting. See you Again!");
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

  public static void MarathiPlaylist() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner sc = new Scanner(System.in);
    String response = "";
    while (!response.equals("B")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("-----------------------Marathi PLaylist---------------------");
      System.out.println("1 - Duniyadari ");
      System.out.println("2 - Deva Tujhya Gabharyala");
      System.out.println("3 - Tik Tik Vajate Dokyat");
      System.out.println("4 - Yara Yara");
      System.out.println("Enter B to Back");
      System.out.println("Enter Q to Quit");
      System.out.print("Enter Above Option: ");

      response = sc.next();
      response = response.toUpperCase();

      switch (response) {
        case ("1"):
          playSong("Duniyadari.wav");
          break;
        case ("2"):
          playSong("Deva_Tujhya_Gabharyala.wav");
          break;
        case ("3"):
          playSong("Tik_Tik_Vajate_Dokayat.wav");
          break;
        case ("4"):
          playSong("Yara_Yara.wav");
          break;
        case ("B"):
          System.out.println("Back to Main Menu!");
          break;
        case ("Q"):
          System.out.println("Quiting. See you Again!");
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner scan = new Scanner(System.in);
    String response = "";
    while (!response.equals("Q")) {
      clear();
      System.out.println("-----------------------Music Player---------------------");
      System.out.println("1 - English PlayList");
      System.out.println("2 - Hindi PlayList");
      System.out.println("3 - Tamil PlayList");
      System.out.println("4 - Marathi PlayList");
      System.out.print("Enter Q to Quit");
      System.out.print("Enter Above Option: ");

      response = scan.next();
      response = response.toUpperCase();

      switch (response) {
        case ("1"):
          EnglishPlaylist();
          break;
        case ("2"):
          HindiPlaylist();
          break;
        case ("3"):
          TamilPlaylist();
          break;
        case ("4"):
          MarathiPlaylist();
          break;
        case ("Q"):
          System.out.println("Quiting. See you Again!");
          break;
        default:
          System.out.println("Not a valid response");
      }

    }
  }

}