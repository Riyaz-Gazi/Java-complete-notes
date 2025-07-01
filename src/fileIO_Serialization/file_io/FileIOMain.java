package fileIO_Serialization.file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\input.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\output.txt");
        int data;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }
    }
}
