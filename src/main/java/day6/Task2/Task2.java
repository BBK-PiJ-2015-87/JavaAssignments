package day6.Task2;

/**
 * Created by Workstation on 22/10/2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};

        ArrayCopier arrayCopier1 = new ArrayCopier(5);
        ArrayCopier arrayCopier2 = new ArrayCopier(3);
        ArrayCopier arrayCopier3 = new ArrayCopier(15);

        int[] dest1 = arrayCopier1.copy(source);
        int[] dest2 = arrayCopier2.copy(source);
        int[] dest3 = arrayCopier3.copy(source);

        print(dest1);
        print(dest2);
        print(dest3);
    }


    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
