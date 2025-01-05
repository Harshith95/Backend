package BinarySearchTree;

public class ClientTest {

	public static void main(String[] args) {
		Tree objTree = new Tree();

		objTree.insert(4);
		objTree.insert(2);
		objTree.insert(3);
		objTree.insert(5);
		objTree.insert(6);

		// objTree.traverseInorder();

		System.out.println(" " + objTree.get(4).getData());
		System.out.println(" " + objTree.get(99));
	}

}
