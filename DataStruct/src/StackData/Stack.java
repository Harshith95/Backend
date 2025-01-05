package StackData;

public class Stack {

	Node top;
	int height;

	class Node {
		private int value;
		private Node next;

		public Node(int val) {
			this.value = val;
		}

	}

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
	// //
	// //
	// //
	// //
	/////////////////////////////////////////////////////////////

	public Node getTop() {
		return top;
	}

	public int getHeight() {
		return height;
	}

	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (height == 0) {
			System.out.println("Top: null");
		} else {
			System.out.println("Top: " + top.value);
		}
		System.out.println("Height:" + height);
		System.out.println("\nStack:");
		if (height == 0) {
			System.out.println("empty");
		} else {
			printStack();
		}
	}

	public void makeEmpty() {
		top = null;
		height = 0;
	}

}
