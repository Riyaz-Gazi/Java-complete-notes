package java8.problem;


import java.util.Arrays;

public class Convert2DArrayTo1DArrayTest {
    public static int[] convert(int[][] arr) {
        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }

    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[] array1D = convert(array2D);
        System.out.println(Arrays.toString(array1D));
    }
}
