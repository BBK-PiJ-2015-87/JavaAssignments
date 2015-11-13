package day8.Task1;

/**
 * Created by Workstation on 13/11/2015.
 */
public interface PersonQueue {

    /**
     * Adds a person to the queue.
     *
     * @param person to be added
     */
    void insert(Person person);

    /**
     * Removes a person from the queue;
     *
     * @return a person from the queue
     */
    Person retrieve();
}
