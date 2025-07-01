package oop.statickey;

public class StaticBlock {
    {
        System.out.println("Normal Block");
    }

    static {
        System.out.println("Static Block");
    }


    public static void main(String[] args) {
        System.out.println("Main Executed");
        StaticBlock staticBlock = new StaticBlock();

    }
}
