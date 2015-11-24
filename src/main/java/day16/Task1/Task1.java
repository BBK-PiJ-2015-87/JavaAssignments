package day16.Task1;

import java.io.*;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        String source = "src/main/resources/fileToRead.txt";
        String dest = "src/main/resources/fileToWrite.txt";
        File src = new File(source);
        File dst = new File(dest);
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            writer = new PrintWriter(dst);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
                writer.write(line.toUpperCase());
                writer.write("\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("There is io exception");
        }finally {
            writer.flush();
            try {
                if (reader != null && writer != null) {
                    reader.close();
                    writer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
