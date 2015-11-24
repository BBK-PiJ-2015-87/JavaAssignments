package day11.Task1;

public class Comparator {

    public int getMax(int n1, int n2) {
        return (int)getMax((double)n1,(double)n2);
    }
    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        return String.valueOf(getMax(n1, n2));
    }
}
