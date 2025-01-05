package LeetCode;
public class BubbleSort {

	// Bubble sort
	public static void main(String[] args) {

		int[] arr = { 1, 43, 7, 11, 2, 1, 4, 68, 92, 5, 1, 89 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
