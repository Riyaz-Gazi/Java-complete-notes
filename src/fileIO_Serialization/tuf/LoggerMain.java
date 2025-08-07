package fileIO_Serialization.tuf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Logger {
    private String path;

    public Logger(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        this.path = path;
    }

    public void log(String message){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,false))) {
            bw.write(message);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Failed to log this message "+message);
        }
    }
}

public class LoggerMain {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger("D:/Java-Complete-Notes/src/fileIO_Serialization/tuf/logfile.txt");
        logger.log("Please log 1");
        logger.log("Please log 2");
        logger.log("Please log 3");
        logger.log("Please log 4");
    }
}
