package day9.Task1;

/**
 * Created by vladimirsivanovs on 17/11/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        IntegerTreeNode root = new IntegerTreeNode(10);
        root.add(8);
        root.add(7);
        root.add(6);
        root.add(9);
        root.add(12);
        root.add(11);
        root.add(15);

//        System.out.println(root.contains(99));
//        System.out.println(root.contains(5));
//        System.out.println(root.getMax());
//        System.out.println(root.getMin());

//        root.printInOrder();
//        System.out.println("");
//        root.printPreOrder();
//        System.out.println("");
//        root.printPostOrder();
        System.out.println(root.toStringPrint());

    }
}
