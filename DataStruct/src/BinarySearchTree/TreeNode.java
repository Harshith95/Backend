package BinarySearchTree;

// PreOrder traversal- root - left and right
// In order traversal- left - root -right
// Post Order traversal- left - right and root

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void insert(int value) {
		// we will not be allowing duplicate insertion of values in trees
		if (value == this.data) {
			return;
		}
		// Insert value to the left as this is a binary search tree left side values
		// should always be less than rightside once
		if (value < this.data) {
			if (this.leftChild == null) {
				this.leftChild = new TreeNode(value);
			} else {
				// Once a value is put in the left 1st node, rest comes in here and if its
				// greater than the value then it goes to below blocks
				this.leftChild.insert(value);
			}
		} else {
			// Greater than values goes in here
			if (this.rightChild == null) {
				this.rightChild = new TreeNode(value);
			} else {
				this.rightChild.insert(value);
			}
		}
	}

	/**
	 * Inorder Traversal
	 */
	public void traverseInOrder() {
		if (this.leftChild != null) {
			this.leftChild.traverseInOrder();
		}
		System.out.println("Data = " + data + ", ");
		if (this.rightChild != null) {
			this.rightChild.traverseInOrder();
		}
	}

	public TreeNode get(int value) {
		if (value == data) {
			return this;
		}

		if (value < data) {
			if (this.leftChild != null) {
				return this.leftChild.get(value);
			}
		} else {
			if (this.rightChild != null) {
				return this.rightChild.get(value);
			}
		}

		return null;
	}

}
