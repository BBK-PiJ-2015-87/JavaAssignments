package day8.Task1;

/**
 * Representation of a person;
 *
 * Created by Vladimirs Ivanovs on 13/11/2015.
 */
public class Person {
    private String name;
    private String age;
    private int id;
    private Person next;

    public Person(String name, String age, int id, Person next) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }
}
