package fileIO_Serialization.file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamMain {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\input.txt");
            FileWriter writer = new FileWriter("D:\\Java-Complete-Notes\\src\\fileIO_Serialization\\FileIO\\input.txt")) {
            boolean charData;
            while ((charData = reader.read() != -1)){
                writer.write(String.valueOf(charData));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
