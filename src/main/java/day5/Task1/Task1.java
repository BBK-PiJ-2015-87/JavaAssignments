package day5.Task1;

public class Task1 {
    static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n - 3);
        System.out.println(n);
    }

    static String buggyMethod(int n) {
        if (n <= 0) {
            return "";
        }
        return n + " " + buggyMethod(n - 2);
    }

    public static void main(String[] args) {
//        printNumbers(6);
        System.out.println(buggyMethod(10));
    }
}
