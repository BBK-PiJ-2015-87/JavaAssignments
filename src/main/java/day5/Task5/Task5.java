package day5.Task5;

public class Task5 {
    static int pow(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return base * pow(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println(pow(2, 8));
        System.out.println(pow(10, 2));
    }
}
