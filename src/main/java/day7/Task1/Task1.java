package day7.Task1;

/**
 * Created by Workstation on 22/10/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        Spy spy1 = new Spy(1);
        Spy spy2 = new Spy(2);
        Spy spy3 = new Spy(3);
        Spy spy4 = new Spy(4);

        Spy.die(spy1);
        Spy.die(spy2);
        Spy.die(spy3);

        Spy.getNumberOfSpies();
    }
}
