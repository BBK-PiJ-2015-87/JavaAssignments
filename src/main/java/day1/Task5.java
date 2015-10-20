package day1;

import java.util.Scanner;

/**
 * Multiplication
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        System.out.println(multiply(num1, num2));


        //TEST
        System.out.println(multiply(0, 10));
        System.out.println(multiply(10, 0));
        System.out.println(multiply(10, 10));
    }

    public static int multiply(int num1, int num2) {
        int result = 0;
        while (num1 > 0) {
            result = result + num2;
            num1--;
        }
        return result;
    }
}
