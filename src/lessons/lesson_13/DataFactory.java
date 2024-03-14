package src.lessons.lesson_13;

import java.io.FileInputStream;

public class DataFactory {
    public static void readFile(String absoluteFilePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(absoluteFilePath);
        }catch (Exception e){
            // TODO: TICKET-123: custom exception
            e.printStackTrace();
        }

    }

    // throw
    // throws

    public static void main(String[] args) {
        DataFactory.readFile("file");
    }
}
