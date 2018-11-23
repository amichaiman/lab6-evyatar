public class ExprTreeNode{ // Facilitator class for the ExprTree
    private char key;
    private ExprTreeNode left, right; // Reference to the right child

    public ExprTreeNode (char key, ExprTreeNode leftPtr, ExprTreeNode rightPtr){
        this.key = key;
        this.left = leftPtr;
        this.right = rightPtr;
    }

    public ExprTreeNode(char key) {
        this.key = key;
        this.left  = null;
        this.right = null;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public ExprTreeNode getLeft() {
        return left;
    }

    public void setLeft(ExprTreeNode left) {
        this.left = left;
    }

    public ExprTreeNode getRight() {
        return right;
    }

    public void setRight(ExprTreeNode right) {
        this.right = right;
    }

}