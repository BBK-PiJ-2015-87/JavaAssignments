package day6.Task3;

/**
 * Created by Workstation on 23/10/2015.
 */
public class Matrix {
    private int[][] matrix;

    public Matrix(int x, int y) {
        matrix = new int[x][y];
        initialize();
    }

    /**
     * Initializes matrix elements to 1.
     */
    private void initialize() {
        for (int[] sub  : matrix) {
            for (int a =0; a < sub.length; a++) {
                sub[a] = 1;
            }
        }
    }

    /**
     * Prints out matrix
     */
    public void print() {
        for (int[] sub  : matrix) {
            for (int a : sub) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }

    /**
     * Set values for a given row
     * @param row number to be updated
     * @param value sequence of numbers (e.g. 1,2,3,5)
     */
    public void setRow(int row, String value) {
        String[] array = value.split(",");
        if (array.length == matrix[row].length) {
            for (int i = 0; i < array.length; i++) {
                matrix[row][i] = Integer.parseInt(array[i]);
            }
        } else {
            System.out.println("Error. Please re-enter numbers.");
        }
    }
}
