public class Main {
    public static void main(String[] args) {
        NodeManager manager = new NodeManager();
        Node tree = manager.getTree();
        int treeDepth = manager.getTreeDepth(tree);

        System.out.println("Depth is " + treeDepth);
    }
}