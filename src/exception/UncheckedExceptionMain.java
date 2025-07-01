package exception;

public class UncheckedExceptionMain {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always Executed");
        }
    }
}
