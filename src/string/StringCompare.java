package string;

public class StringCompare{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // Method-1 equals();
        System.out.println("equals()");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // Method - 2 ==
        System.out.println("==");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        // Method -2 compareTo()
        System.out.println("compareTo()");
        System.out.println(s1.compareTo(s2));

    }
}
