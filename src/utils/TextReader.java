package utils;

import java.io.IOException;
import java.util.Scanner;

public class TextReader {

    public static void read(String filePath) {
        try {
            java.io.FileReader reader = new java.io.FileReader(filePath);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File path not correct - " + filePath);
        }
    }
}
