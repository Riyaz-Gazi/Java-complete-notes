package oop.statickey;

class Men{

    static int LEG = 2;
    static void walk(){
        System.out.println("Men is walking");
    }

}

public class StaticTest {
    public static void main(String[] args) {
        Men.walk();
        System.out.println(Men.LEG);
        Men.LEG= 4;
        System.out.println(Men.LEG);


    }
}
