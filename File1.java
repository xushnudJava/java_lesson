package java_qollanma;

import jdk.jfr.internal.tool.Main;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("tt.txt");

        if (file.exists()){
            System.out.println("file bor :o");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());

//            file.delete();
        }else System.out.println("Bunaqa file yo'q :-(");
    }
}
