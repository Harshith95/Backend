package linkedlistdata;

public class LinkedList {

	private Node head;
	private Node tail;
	private int len;

	public LinkedList(int inp) {
		Node newNode = new Node(inp);
		head = newNode;
		tail = newNode;
		len = 1;

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print("Value " + temp.value + " ");
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head : " + head.value);
	}

	public void getTail() {
		System.out.println("Tail : " + tail.value);
	}

	public void getLength() {
		System.out.println("Length : " + len);
	}

	/**
	 * Add value to end of the list
	 * 
	 * @param inp
	 */
	public void append(int inp) {
		Node newNode = new Node(inp);
		// if empty list
		if (len == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		len++;
	}

	public Node removeLast() {
		if (len == 0) {
			return null;
		} else {
			Node temp = head;
			Node pre = head;
			while (temp.next != null) {
				pre = temp;
				temp = temp.next;
			}
			tail = pre; 
			tail.next = null;
			len--;
			if (len == 0) {
				head = null;
				tail = null;
			}
			return temp;
		}
	}

	/**
	 * Adds the element to beginning of the list
	 * 
	 * @param inp
	 */
	public void prepend(int inp) {
		// if list is empty
		Node newNode = new Node(inp);
		if (len == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		len++;
	}

	public Node removeFirst() {
		if (len == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		len--;
		if (len == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= len) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public boolean set(int index, int value) {
		if (get(index) != null) {
			Node temp = get(index);
			temp.value = value;
			return true;
		}

		return false;
	}

	public boolean insert(int index, int value) {
		if (index < 0 && index >= len) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == len) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		len++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 && index >= len) {
			return null;
		}
		if (index == 0) {
			Node nd = removeFirst();
			return nd;
		}
		if (index == len - 1) {
			Node nd = removeLast();
			return nd;
		}
		Node temp = get(index);
		Node prev = get(index - 1);
		prev.next = temp.next;
		temp.next = null;

		len--;
		return null;
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		// Node after = temp.next;
		Node before = null;
		for (int i = 0; i < len; i++) {
			Node after = temp.next;
			temp.next = before; // repoint it to previous
			before = temp;// pointer
			temp = after;// pointer to next node
		}

	}

}
