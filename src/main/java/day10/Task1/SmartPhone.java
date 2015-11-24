package day10.Task1;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String url) {
        System.out.println("Opening " + url);
    }

    public void findPosition() {
        System.out.println("London, UK");
    }

    @Override
    public void call(String number) {
        if (number.startsWith("00")) {
            System.out.println("Calling " + number + " through the internet to save money");
        } else {
            super.call(number);
        }
    }

    public void playGame(String name) {
        System.out.println("Starting game " + name);
    }
}
