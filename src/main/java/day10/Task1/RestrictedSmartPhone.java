package day10.Task1;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class RestrictedSmartPhone extends SmartPhone{

    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

    @Override
    public void playGame(String name) {
        System.out.println("Games are blocked");
    }

}
