package day7.Task3;

/**
 * Created by Workstation on 24/10/2015.
 */
public class PatientList {
    public Patient headPatient = null;
    public Patient tailPatient = null;
    private int size = 0;

    public void add(Patient newPatient) {
        if (isEmpty()) {
            headPatient = newPatient;
            tailPatient = headPatient;
        } else {
            headPatient.addPatient(newPatient);
            tailPatient = newPatient;
        }
        size ++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
