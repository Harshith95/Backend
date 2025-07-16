package LeetCode;

public class IsSubSequence {

    public static void main(String[] args) {
        String s = "app", t = "apple";
        boolean isFla = isSubsequence(s, t);
        System.out.println(isFla);
    }

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        /**
         *
         * Below 2 lines for getting results quickly, if value is 0 then its match
         * int flag = t.indexOf(s);
         *  System.out.println("index"+flag);
         *
         */

        int i = 0;
        int j = 0;
        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }
}
