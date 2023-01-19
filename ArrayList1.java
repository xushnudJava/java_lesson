package java_qollanma;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.add(1,"lavash");

        food.set(0,"sho'rva");

        food.remove(3);

        for (int i=0; i<food.size(); i++) System.out.println(food.get(i));

        food.clear();

        System.out.println(food);

    }
}
