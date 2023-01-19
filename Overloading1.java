package java_qollanma;

public class Overloading1 {
    static int add(){
        return 0;
    }
    static int add(int a, int b) {
        return a + b;
    }
    static String add(String a, String b){
        return a + b ;
    }

    public static void main(String[] args) {
        System.out.println(add());

        System.out.println(add(3,56));

        System.out.println(add("sa","lom"));
    }



}
