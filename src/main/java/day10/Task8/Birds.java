package day10.Task8;

/**
 * Created by vladimirsivanovs on 24/11/2015.
 */
abstract class Birds extends Animal{

    public Birds(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        layEggs();
    }

    public void layEggs() {
        System.out.println("We are birds. We lay eggs.");
    }

    public void call() {
        System.out.println(this.name + " now flying, will come later when tired...");
    }
}
