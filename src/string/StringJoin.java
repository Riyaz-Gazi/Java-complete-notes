package string;

public class StringJoin {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Orange"};
        final String sentence = String.join(",", fruits);
        System.out.println(sentence);
    }
}
