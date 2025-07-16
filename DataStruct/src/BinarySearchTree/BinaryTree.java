package BinarySearchTree;

public class BinaryTree {
    Node root;

    // inorder traversal
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(" :: Node :: " + node.data);
        inorder(node.right);
    }


    int height(Node node){
        if(node == null){
            return 0;
        }
        return 1+ Math.max(height(node.left), height(node.right));
    }
}
