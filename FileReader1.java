package java_qollanma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("tt.txt");

            int date = reader.read();

            while (date != -1){
                System.out.print((char) date);
                date = reader.read();
            }


            reader.close();

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
