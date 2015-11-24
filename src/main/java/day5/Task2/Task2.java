package day5.Task2;

public class Task2 {

    public int factorialRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorialRec(n - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        Task2 app = new Task2();
        System.out.println(app.factorialRec(10));
    }
}

