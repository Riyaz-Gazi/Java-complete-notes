package exception;

public class FinallyExceptionMain {
    public static void main(String[] args) {
        try {
            int res = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            throw new RuntimeException("Exception in finally block");
        }
    }
}
