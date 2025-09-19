package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Write a function to reverse words in the sentence.
    Reverse the words only. Dots, spaces and commas should remain as it is.
    Words will contain aA to zZ characters only and will not contain anything else.
    Delimiters are only dots, spaces and commas.
    For example: Input (String): "My, name. is Abc Output" (String): "yM, eman. si cbA"
*/

public class ReverseStringJava8 {

    public static void main(String[] args) {

        String input = "My, name. is Abc";
        String out = reverseStringJava8(input);
        System.out.println("Result:: " + out);
    }

    public static String reverseStringJava8(String input) {
        List<String> inputList = Arrays.asList(input.split("(?<=\\W)|(?=\\W)"));
        String out = "";

        out = inputList.stream().map(token -> token.matches("[a-zA-Z]+")
                ? new StringBuilder(token).reverse().toString()
                : token).collect(Collectors.joining());
        return out;
    }

}
