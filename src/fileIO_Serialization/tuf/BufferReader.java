package fileIO_Serialization.tuf;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/Java-Complete-Notes/src/fileIO_Serialization/tuf/test.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("Line "+line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }
}
