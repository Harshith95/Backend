package LeetCode;
class Node {
	public int value;
	public Node left;
	public Node right;

	Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}
}

public class BinaryTree {

	Node root;

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(3);
		bt.add(9);
		bt.add(20);

		bt.add(15);
		bt.add(7);

		// preOrderTrav(bt.root);
		System.out.println("Max Depth:: " + maxDepth(bt.root));
	}

	private static void preOrderTrav(Node root) {
		if (root == null) {
			return;
		}
		System.out.println("Value ::" + root.value);
		preOrderTrav(root.left);
		preOrderTrav(root.right);
	}

	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		int lDepth = maxDepth(root.left);
		int rDepth = maxDepth(root.right);

		return Math.max(lDepth, rDepth) + 1;

	}
}