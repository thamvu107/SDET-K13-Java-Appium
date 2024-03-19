package src.lessons.lesson13.v5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataFactory {
    public static void readFile(String absoluteFilePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(absoluteFilePath);
        } catch (FileNotFoundException e1) {
            // TODO: TICKET-123: custom exception
            System.err.println("File not found " + absoluteFilePath);
        } catch (Exception e4) {
            System.err.println("An error occurred while processing file: " + absoluteFilePath);
        }

        System.out.println("Continuing processing after exception handling");
    }

    // throw
    // throws

    public static void main(String[] args) {
        DataFactory.readFile("ti_File");
    }
}
