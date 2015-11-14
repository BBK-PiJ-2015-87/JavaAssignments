package day8.Task1;

/**
 * Queue as a linked list.
 *
 * Created by Workstation on 13/11/2015.
 */
public class PersonQueueImpl implements PersonQueue {

    private int size = 0;
    private Person first; //first element of the queue.

    public void insert(Person person) {
        person.setNext(first);
        first = person;
    }

    public Person retrieve() {

        return null;
    }

    public int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
