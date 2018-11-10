package soloTasks;

import java.util.TreeSet;

public class BinaryTree {
    private int numberOfLevels;

    private class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinaryTree(int[] array) {
        Node root = new Node(array[0]);
        int height = (int)Math.pow(2,(numberOfLevels+1));
        for (int i = 1; i < height; i++) {
            if (array[i] > root.value) {
                if (root.right != null) {
                    root.left = new Node(array[i]);
                } else {
                    root.right = new Node(array[i]);
                }
            } else {
                if(root.left!=null){
                    root.right =new Node(array[i]);
                }else{
                    root.left =new Node(array[i]);
                }
            }

        }
    }

}
