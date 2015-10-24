package day7.Task3;

/**
 * Created by Workstation on 24/10/2015.
 */
public class Task3 {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Vlad", 28, "Cold");
        Patient patient2 = new Patient("Jhon", 30, "Check up");
        Patient patient3 = new Patient("Fred", 50, "Prescription");
        Patient patient4 = new Patient("Alba", 35, "Singer");
        Patient patient5 = new Patient("Jessica", 40, "Pop star");

        PatientList list = new PatientList();

        list.add(patient1);
        list.add(patient2);
        list.add(patient3);
        list.add(patient4);
        list.add(patient5);

        System.out.println(patient2.getNextPatient().getName());
        System.out.println(list.getSize());
        System.out.println(list.headPatient.getName());
        System.out.println(list.headPatient == patient1);
        System.out.println(list.headPatient.getNextPatient().getIllness());
        System.out.println(list.tailPatient.getAge());

    }
}
