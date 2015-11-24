package day10.Task8;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
public class Eagle extends Birds {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm an eagle.");
    }
}
