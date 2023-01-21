package java_qollanma;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio1 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);


        File file = new File("adamlar.wav ");

        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();

        clip.open(inputStream);




        String response = scanner.next();

        while (!response.equals('Q')){
            System.out.println("P = play, S = top, R = reset, Q = quit");
            System.out.print("Enter your choise: ");

            response = scanner.nextLine();
            response = response.toUpperCase();

            switch (response){
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                case "R":
                    clip.setMicrosecondPosition(10);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println();
                    System.out.println("Error");
                    System.out.println();
            }
        }
    }
}
