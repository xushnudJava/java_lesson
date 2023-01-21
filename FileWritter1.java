package java_qollanma;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter1 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("tt.txt");
            fileWriter.write("Roses are red\nViolets are blue\nOlmani ol");
            fileWriter.append("\n (A tt by Muhammad Yusuf)");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
