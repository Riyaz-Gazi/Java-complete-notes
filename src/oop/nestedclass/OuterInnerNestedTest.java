package oop.nestedclass;

class Outer{
    int outerVar = 10;

    static int outerStatic = 100;

    class Inner{
        public void innerShow(){
            System.out.println("Inner value "+outerVar);
        }
    }

    static class StaticNested {
        void display() {
            System.out.println("Outer static var: " + outerStatic);
        }
    }
}

public class OuterInnerNestedTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.innerShow();

        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();
    }
}
