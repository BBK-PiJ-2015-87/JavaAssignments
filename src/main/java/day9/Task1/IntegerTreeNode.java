package day9.Task1;

/**
 * Created by vladimirsivanovs on 17/11/2015.
 */
public class IntegerTreeNode {
    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public IntegerTreeNode(int value) {
        this.value = value;
    }

    /**
     * Adds new node.
     *
     * @param value of the node
     */
    public void add(int value) {
        if (value > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(value);
            } else {
                right.add(value);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(value);
            } else {
                left.add(value);
            }
        }
    }

    /**
     * Checks if value is contained in all the nodes.
     *
     * @param value to check
     * @return true if value is found, false otherwise
     */
    public boolean contains(int value) {
        if (value == this.value) {
            return true;
        } else if (value > this.value) {
            if (this.right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        }
    }

    /**
     * Finds maximum value out of all nodes.
     *
     * @return maximum value
     */
    public int getMax() {
        if (this.right == null) {
            return this.value;
        } else {
            return right.getMax();
        }
    }

    /**
     * Finds minimum value out of all nodes.
     *
     * @return minimum value
     */
    public int getMin() {
        if (this.left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[" + this.value);
        if (this.left != null) {
            result.append("L" + left.value);
        }
        if (this.right != null) {
            result.append("[R]");
        }

        return result.toString();
    }

    /**
     * Prints elements in depth-first pre-order sequence.
     * 1. Traverse left subtree by recursively calling pre-order function
     * 2. Print root element
     * 3. Traverse right subtree by recursively calling pre-order function
     */
    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }

        System.out.print(this.value + ",");

        if (this.right != null) {
            this.right.printInOrder();
        }
    }

    /**
     * Prints elements in depth-first pre-order sequence.
     * 1. Print root element
     * 2. Traverse left subtree by recursively calling pre-order function
     * 3. Traverse right subtree by recursively calling pre-order function
     */
    public void printPreOrder() {
        System.out.print(this.value + ",");

        if (this.left != null) {
            this.left.printPreOrder();
        }

        if (this.right != null) {
            this.right.printPreOrder();
        }
    }

    /**
     * Prints elements in depth-first pre-order sequence.
     * 1. Traverse left subtree by recursively calling pre-order function
     * 2. Traverse right subtree by recursively calling pre-order function
     * 3. Print root element
     */
    public void printPostOrder() {
        if (this.left != null) {
            this.left.printPostOrder();
        }

        if (this.right != null) {
            this.right.printPostOrder();
        }

        System.out.print(this.value + ",");
    }
}
