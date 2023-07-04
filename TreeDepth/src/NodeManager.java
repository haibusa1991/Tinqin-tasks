public class NodeManager {

    public Node getTree() {

        Node node1 = new Node(null, "root");
        Node node2 = new Node(node1, "level 1 - left");
        Node node3 = new Node(node1, "level 1 - right");
        node1.setLeftNode(node2);
        node1.setRightNode(node3);

        Node node4 = new Node(node2, "level 2 - left1");
        Node node5 = new Node(node2, "level 2 - right1");
        node2.setLeftNode(node4);
        node2.setRightNode(node5);

        Node node6 = new Node(node3, "level 2 - left2");
        Node node7 = new Node(node3, "level 2 - right2");
        node3.setLeftNode(node4);
        node3.setRightNode(node5);

        Node node8 = new Node(node5, "level 3 - left1");
        node5.setLeftNode(node8);

        return node1;
    }

    public int getTreeDepth(Node node) {
        int leftDepth = 1;
        int rightDepth = 1;

        if (node.getLeftNode() != null) {
            leftDepth += getTreeDepth(node.getLeftNode());

        }

        if (node.getRightNode() != null) {
           rightDepth+= getTreeDepth(node.getRightNode());
        }

        return Math.max(leftDepth,rightDepth);
    }
}
