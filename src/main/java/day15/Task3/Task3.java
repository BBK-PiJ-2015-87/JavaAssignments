package day15.Task3;

import java.util.Scanner;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Please enter an integer:");
                num = Integer.parseInt(sc.nextLine());
                System.out.println("Attempt number: " + i);
                result += num;
                System.out.println("Sum is: " + result);
            } catch (NumberFormatException ex) {
                System.out.println("Please provide an integer");
                i--;
            }
        }
        System.out.println("Average is: " + result/10.0);
    }
}
