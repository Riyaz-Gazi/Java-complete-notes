package string;

public class StringMatching {
    public static void main(String[] args) {
        String email = "example@domain.com";
        boolean isValid = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println(isValid);
    }
}
