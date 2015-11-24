package day10.Task1;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class OldPhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println(number);
    }
}
