package wrapperclass_generics.generics;

class Dog<T>{
    T name;
    public Dog(T name){
        this.name = name;
    }

    public void setName(T name){
        this.name = name;
    }

    public T getName(){
        return name;
    }

    // 🔹 Generic method to print any object
    public static <E> void printAnything(E value) {
        System.out.println("Printing: " + value);
    }

    public <U> void print(U value) {
        System.out.println("Printing: " + value);
    }

}

public class GenericsMain {

    public static void main(String[] args) {
        Dog<String> dog1 = new Dog("Don"); // String
        Dog dog2 = new Dog(123); // Integer
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        Dog.printAnything("Dog");
        Dog.printAnything(123);
        dog1.print(123);

    }
}
