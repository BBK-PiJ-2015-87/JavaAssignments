package day2;

/**
 * Created by Workstation on 20/10/2015.
 */
public class Task12 {
    public static void main(String[] args) {
        piramid(8);

    }

    public static void piramid(int num) {
        int toPrint = 1;
        int internal = toPrint;
        while (num > 0) {
            while (internal > 0) {
                System.out.print(toPrint);
                internal--;
            }
            num--;
            toPrint++;
            internal = toPrint;
            System.out.println();
        }
        System.out.printf("\\ldots");
    }
}
