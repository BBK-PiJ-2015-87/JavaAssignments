package day6.Task2;

/**
 * Created by Workstation on 22/10/2015.
 */
public class ArrayCopier {
    private int[] destination;

    public ArrayCopier(int length) {
        destination = new int[length];
    }

    public int[] copy(int[] source) {
        int iter = (destination.length < source.length)? destination.length : source.length;
        for (int i =0; i < iter; i++) {
            destination[i] = source[i];
        }
        return destination;
    }
}
