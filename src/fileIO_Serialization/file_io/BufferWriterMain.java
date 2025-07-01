package fileIO_Serialization.file_io;

import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterMain {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\output.txt")) {
            writer.write("Hello from west bengal");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
