package day7.Task2;

import java.util.Scanner;

/**
 * Created by Vladimirs Ivanovs on 24/10/2015.
 */
public class Marks {
    private static int totalMarks = 0;
    private static int distinction = 0;
    private static int passes = 0;
    private static int failed = 0;
    private static int invalid = 0;


    /**
     * Reads input of marks from the user
     */
    public void input() {
        Scanner input = new Scanner(System.in);
        int mark = -1;
        do {
            System.out.print("Enter a mark: ");
            mark = input.nextInt();
            sort(mark);
            System.out.printf("%d", mark);
            System.out.println();
        } while (mark != -1);
    }

    /**
     * Sorts marks according to it's value
     * @param mark provided by a user
     */
    private void sort(int mark) {
        if (mark > 100) {
            invalid++;
        }else if (mark >= 70 && mark < 100) {
            distinction++;
            totalMarks++;
        }else if (mark >= 50 && mark < 70) {
            passes++;
            totalMarks++;
        }else if (mark >= 0 && mark < 50) {
            failed++;
            totalMarks++;
        }
    }

    /**
     * Prints marks
     */
    public void print() {
        System.out.printf("There are %d students: %d distinctions, %d pass, %d fails, %d invalid.", totalMarks, distinction, passes, failed, invalid);
    }

}
