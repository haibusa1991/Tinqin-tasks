public class Node {

    private Node parentNode = null;
    private Node leftNode = null;
    private Node rightNode = null;

    private String value;

    public Node(Node parentNode, String value) {
        this.parentNode = parentNode;
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return value;
    }
}
