package LeetCode;

public class Fibonacci2 {
	static int n=10;
	static int sum=0;
	static int i=-1;
	static int j=1;
	public static void fibonacciRecursion() {
		int a;
		if (n == 0) {
			
			return;
		}
		sum=i+j;
		System.out.print(sum + " ");
		n--;
		a= j;
		j=sum;
		i=a;
		fibonacciRecursion() ;
	}

	public static void main(String args[]) {
		fibonacciRecursion();
	
	}

}
