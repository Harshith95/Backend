package Stacks;

public class StackClass {
	public static Node head;
	public int length = 0;

	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Method is used to add the element on top of the queue(head)
	 * 
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	/**
	 * Method is used to pop the element from top of the list
	 * 
	 * @return
	 */
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		length--;
		return top;

	}

	/**
	 * Method is used to peek or pick the topmost element from the list
	 * 
	 * @return
	 */
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;

	}

}
