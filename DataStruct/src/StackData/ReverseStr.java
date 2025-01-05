package StackData;

public class ReverseStr {

	public static void main(String[] args) {
		String myString = "hello";
		String reversedString = reverseString(myString);
		System.out.println(reversedString);

	}

private static String reverseString(String myString) {
	java.util.Stack<Character> stack = new java.util.Stack<>();
    String reversedStr = "";
    for(char c: myString.toCharArray()) {
    	stack.push(c);
    }
    while(!stack.isEmpty()) {
    	reversedStr += stack.pop();
    }
    return reversedStr;
}


    
}
