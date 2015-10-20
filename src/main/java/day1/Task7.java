package day1;

/**
 * Naive sorting
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sort(array);


        //TEST
        for (int i : array) {
            System.out.println(i);
        }

    }

    public static void sort(int[] array) {
        int tmp;
        for (int e = array.length; e > 0; e--) {
            for (int i=0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    System.out.println("Swapping" + array[i] + " with " + array[i+1]);
                    tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                }
            }
        }

    }
}
