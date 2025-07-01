package java8.lambda;

@FunctionalInterface
interface Calculator{
    int operator(int a,int b);
}

public class LambdaMain {
    public static void main(String[] args) {
        Calculator add = (a,b)->a+b;
        Calculator multiply = (a,b)->a*b;

        System.out.println("Addition "+add.operator(2,3));
        System.out.println("Multiplication "+multiply.operator(2,3));
    }
}
