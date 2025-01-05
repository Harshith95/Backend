package LeetCode;

public class AddStrings {

	public static void main(String[] args) {
		System.out.println(addStrings("1", "1"));
	}

	public static String addStrings(String num1, String num2) {
		double nm1 = Double.valueOf(num1);
		double nm2 = Integer.valueOf(num2);
		System.out.println(nm1);
		System.out.println(nm2);
		double res = nm1 + nm2;
		return String.valueOf(res);
	}

}
