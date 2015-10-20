package day1;

import java.util.Scanner;

/**
 * Prime numbers
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleaseenter a number");
        isPrime(scanner.nextInt());

        //TEST
        int[] test = {1, 7, 13, 20, 1201, 10};
        for (int a : test) {
            isPrime(a);
        }

    }

    public static void isPrime(int num) {
        int div = 2;
        while (num >= div * div) {
            if (num % div == 0) {
                System.out.println("Not prime");
                return;
            }
            div++;
        }
        System.out.println("Prime");
    }
}
