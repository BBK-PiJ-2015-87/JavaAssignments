package day15.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        int newElement = 10;
        try {
            list.add(newElement);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}



