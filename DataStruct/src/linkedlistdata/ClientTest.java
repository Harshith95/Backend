package linkedlistdata;

public class ClientTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		// ll.insert(3, 5)
		ll.remove(2);
		ll.printList();
		// ll.reverse();
		// System.out.println();
		// ll.printList();

	}

}
