package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("example.text"));
    }
}
