package LeetCode;

import java.util.Arrays;

public class SecondLargestNum {
	public static void main(String[] args) {

		int arr[] = { 13, 37, 46, 9, 45, 39, 11 };
		System.out.println("Enter array elements :");

		System.out.println("Array elements are" + Arrays.toString(arr));
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second highest/largest element in the array");
		} else {
			System.out.println("Second highest element in array is :" + secondLargest);
		}

	}
}
