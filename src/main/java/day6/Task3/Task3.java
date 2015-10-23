package day6.Task3;

/**
 * Created by Workstation on 23/10/2015.
 */
public class Task3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(10, 4);
        matrix.setElement(1,2,200);
        matrix.setRow(3, "5,5,5,5");
        matrix.print();
    }
}
