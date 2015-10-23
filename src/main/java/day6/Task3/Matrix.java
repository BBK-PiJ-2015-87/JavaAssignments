package day6.Task3;

/**
 * Created by Vladimirs Ivanovs on 23/10/2015.
 */
public class Matrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    public Matrix(int x, int y) {
        rows = x;
        columns = y;
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
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Sets value of an element
     *
     * @param row number
     * @param column number
     * @param value to be set
     */
    public void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }

    /**
     * Sets values for a given row
     * @param row number to be updated
     * @param value comma separated sequence of numbers (e.g. 1,2,3,5)
     */
    public void setRow(int row, String value) {
        String[] array = value.split(",");
        if (array.length == columns) {
            for (int i = 0; i < columns; i++) {
                matrix[row][i] = Integer.parseInt(array[i]);
            }
        } else {
            System.out.println("Error. Please re-enter numbers.");
        }
    }

    /**
     * Sets values for a given column
     * @param column number to be updated
     * @param value comma separated sequence of numbers
     */
    public void setColumn(int column, String value) {
        String[] array = value.split(",");
        if (array.length == rows) {
            for (int i = 0; i < rows; i++) {
                matrix[i][column] = Integer.parseInt(array[i]);
            }
        } else {
            System.out.println("Error. Please re-enter numbers.");
        }
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();
        string.append("[");
        for (int[] row : matrix) {
            string.append("[");
            for (int pos =0; pos < row.length; pos++) {
                string.append(row[pos]);
                if (pos < row.length -1 ) string.append(",");
            }
            string.append("]");
        }
        string.append("]");
        return string.toString();
    }
}
