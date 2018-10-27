package soloTasks;

public class BinaryTree {

    Node root;

    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node nextNode = root;
            Node parent;
            while (true) {
                parent = nextNode;
                if (value < nextNode.value) {
                    nextNode = nextNode.left;
                    if (nextNode == null) {
                        parent.left = newNode;
                        return;
                    } else {
                        nextNode = nextNode.right;
                        if (nextNode == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }
    }
}
