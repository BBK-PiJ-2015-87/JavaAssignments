package day3;

import java.util.Scanner;

/**
 * Read letters
 */
public class Task9 {
    public static void main(String[] args) {
        //TEST
        count("eeeee", 'e');

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter string");
        String text = in.nextLine();
        System.out.println("Please enter a letter");
        String text2 = in.nextLine();
        char find = text2.charAt(0);
        count(text, find);


    }

    public static void count(String text, char find ) {
        char[] textChars = text.toCharArray();
        int count = 0;
        for (char c : textChars) {
            if (c == find) count++;
        }
        System.out.println(count);
    }
}
