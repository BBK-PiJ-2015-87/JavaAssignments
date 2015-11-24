package day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();

        System.out.println(comparator.getMax(1, 2));
        System.out.println(comparator.getMax(10.2, 10.3));
        System.out.println(comparator.getMax("10", "111"));
    }
}
