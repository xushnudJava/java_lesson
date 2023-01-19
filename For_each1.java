package java_qollanma;

import java.util.ArrayList;

public class For_each1 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Kuchuk");
        animals.add("Tovus");
        animals.add("Ilon");
        animals.add("Mushuk");

        for (String str : animals){
            System.out.println(str);
        }
    }
}
