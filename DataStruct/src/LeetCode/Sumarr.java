package LeetCode;

public class Sumarr {
	public static void main(String[] args) {
		int sum = 0;
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum += i + j;
			}
			System.out.print(" : " + sum + ":");
		}
		System.out.println(sum);
	}
}
