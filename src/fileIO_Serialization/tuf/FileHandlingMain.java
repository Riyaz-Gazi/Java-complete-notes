package fileIO_Serialization.tuf;

import java.io.File;
import java.io.IOException;

public class FileHandlingMain {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Java-Complete-Notes/src/fileIO_Serialization/tuf/test.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.canRead());
    }
}
