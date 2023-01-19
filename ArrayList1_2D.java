package java_qollanma;

import java.util.ArrayList;

public class ArrayList1_2D {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("olma");
        str1.add("gilos");
        str1.add("nok");

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("pepsi");
        str2.add("cola");
        str2.add("mohito");

        ArrayList<ArrayList<String>> str = new ArrayList();
        str.add(str1);
        str.add(str2);

        System.out.println(str);
    }
}
