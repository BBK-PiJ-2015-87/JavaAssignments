package day7.Task1;

public class Spy {
    public static int spyCount;
    private int id;

    public Spy(int id ) {
        this.id = id;
        spyCount++;
        System.out.println("New spy's ID is: " + id);
        System.out.println("Total number of spies is: " + spyCount);
    }

    public static void die(Spy spy) {
        spyCount--;
        System.out.printf("Spy %d has been detected and eliminated", spy.id);
        System.out.println("Total number of spies left: " + spyCount);
    }

    public static int getNumberOfSpies() {
        return spyCount;
    }

}