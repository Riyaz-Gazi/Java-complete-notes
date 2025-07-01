package oop.nestedclass;

class Animals {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

public class AnonymousClassExtendsCLass {
    public static void main(String[] args) {
        Animals dog = new Animals() {
            @Override
            public void makeSound() {
                System.out.println("Dogs Sound");
            }
        };

        dog.makeSound();
    }
}
