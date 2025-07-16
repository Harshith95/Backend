package BinarySearchTree;

public class ClientTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node node = new Node(1);
        Node nodeLeft = new Node(2);
        Node nodeRight = new Node(3);
        tree.root = node;
        tree.root.left = nodeLeft;
        tree.root.right = nodeRight;
        System.out.println("Height of the sub tree"+ tree.height(tree.root));
        System.out.println("In order traversal");
        tree.inorder(tree.root);
    }
}
