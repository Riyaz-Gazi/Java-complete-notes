package exception;

class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

public class ConstructorExceptionExample {

    private int age;
    public ConstructorExceptionExample(int age) throws AgeException {
        if(age<18){
            throw new AgeException("Age must be at least 18.");
        }
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            ConstructorExceptionExample obj = new ConstructorExceptionExample(15);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }

}
