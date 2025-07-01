package exception;

public class SystemExitExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }
    }
}
