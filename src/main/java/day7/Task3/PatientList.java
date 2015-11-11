package day7.Task3;

/**
 * Created by Workstation on 24/10/2015.
 */
public class PatientList {

    private Node head = null;
    private Node tail = null;

    class Node{
        private Patient patient;
        public Node nextNode;

        public Node(Patient patient, Node node) {
            this.patient = patient;
            nextNode = node;
        }

        public Patient getPatient() {
            return patient;
        }

        public void setPatient(Patient patient) {
            this.patient = patient;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node) {
            nextNode = node;
        }



    }

}




