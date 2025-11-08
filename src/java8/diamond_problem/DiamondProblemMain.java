package java8.diamond_problem;

interface A {
    default void foo() {
        System.out.println("A's foo");
    }
}

interface B extends A {
    default void foo() {
        System.out.println("B's foo");
    }
}

interface C extends A {
    default void foo() {
        System.out.println("C's foo");
    }
}

class D implements B, C {
    @Override
    public void foo() {
        C.super.foo();
    }
}

public class DiamondProblemMain {
    public static void main(String[] args) {
        D d = new D();
        d.foo();
    }
}
