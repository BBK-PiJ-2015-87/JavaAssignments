package day16.Task1;

import java.io.*;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        String location = "./resources/fileToRead.txt";
        File file = new File(location);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("There is io exception");
        }

    }
}
