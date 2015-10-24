package day7.Task3;

/**
 * Created by Vladimirs Ivanovs on 24/10/2015.
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setNextPatient(Patient nextPatient) {
        this.nextPatient = nextPatient;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }
}
