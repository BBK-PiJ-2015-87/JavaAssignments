package day10.Task8;

public abstract class Animal implements Reproducible{
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void call();

    public abstract void makeSound();
}
