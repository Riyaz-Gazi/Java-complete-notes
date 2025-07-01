package java8.functional_interface;

@FunctionalInterface
interface MyFunctionalInterface{
    void perform(int a);

    default void log(String message){
        System.out.println("Log : "+message);
    }
    static void greet(){
        System.out.println("Hello From Functional Interface");
    }
}

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        // Called default Methods
        MyFunctionalInterface.greet();
        // Called default and abstract methods
        MyFunctionalInterface action = (a)-> System.out.println("Hello from "+a);
        action.log("Riyaz");
        action.perform(4);
    }
}
