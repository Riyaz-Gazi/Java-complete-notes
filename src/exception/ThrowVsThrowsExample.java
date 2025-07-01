package exception;

public class ThrowVsThrowsExample {
    public static void main(String[] args) {
        try {
            checkNumber(-1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int num) throws IllegalArgumentException{
        if(num<0){
            throw new IllegalArgumentException("Number must be positive");
        }
    }
}
