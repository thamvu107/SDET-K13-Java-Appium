package src.lessons.lesson_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class V6DataFactory {
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
        V6DataFactory.readFile("ti_File");
    }
}
