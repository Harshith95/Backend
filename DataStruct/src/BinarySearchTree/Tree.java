package BinarySearchTree;

public class Tree {
	private TreeNode root;

	public void insert(int value) {
		if (this.root == null) {
			this.root = new TreeNode(value);
		} else {
			this.root.insert(value);
		}
	}

	public void traverseInorder() {
		if (this.root != null) {
			this.root.traverseInOrder();
		}
	}

	public TreeNode get(int value) {
		if (this.root != null) {
			return this.root.get(value);
		}
		return null;
	}

}