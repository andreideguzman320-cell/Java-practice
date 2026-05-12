
import javax.sound.sampled.*;
import java.util.*;
import java.io.*;

public class Musicplayer {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String filePath="C:\\Users\\admin\\Downloads\\Maki - Kailan_ (Official Lyric Video).wav";
        File file = new File(filePath);

        try(AudioInputStream stream= AudioSystem.getAudioInputStream(file)){
            String response = "";
            Clip clip=AudioSystem.getClip();
            clip.open(stream);




            while(true){

                System.out.println("test run input:  Y/N");
                System.out.print("Enter Choice: ");

                response=scanner.nextLine().toUpperCase();
                switch(response){
                    case "Y"-> {

                        clip.start();

                    }

                    case "Q"-> {
                        System.out.println(" ");
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }


            }

        }catch(FileNotFoundException e){
            System.out.println("Could not locate File Location");
        }
        catch(LineUnavailableException e){
            System.out.println("Line unvailable ");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported audio file");
        }
        catch(IOException e){
            System.out.println("A problem has Occurred");
        }
        finally{
            System.out.println(" ");
        }
    }//public main

}//class main
