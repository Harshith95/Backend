package Stacks;

public class StackClient {
	public static void main(String[] args) {
		StackClass stck = new StackClass();
		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);

		while (!stck.isEmpty()) {
			System.out.println(stck.peek());
			stck.pop();
		}

	}
}
