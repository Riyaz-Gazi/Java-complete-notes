package fileIO_Serialization.file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderMain {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
