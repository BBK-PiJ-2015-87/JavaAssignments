package day10.Task1;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class MobilePhone extends OldPhone {

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String time) {
        System.out.println("Alarm is set to: " + time);
    }

    private void playGame(String name) {
        System.out.println("Starting game " + name);
    }

    public void printLastNumbers() {
        System.out.println("No numbers recorded.");
    }


}
