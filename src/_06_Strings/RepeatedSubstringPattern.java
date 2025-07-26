package _06_Strings;

/*
* Leetcode: 459. Repeated Substring Pattern
*
* Given a string s, check if it can be constructed by taking a substring of it
* and appending multiple copies of the substring together.
*
* */

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        //all possible lengths of the repeating substring
        for (int i = 1; i <= n / 2; i++) {
            // Only check if i divides n evenly
            if (n % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();

                // Repeat the substring (n / i) times
                for (int j = 0; j < n / i; j++) {
                    sb.append(sub);
                }

                //if it matches the original
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));

        String s2 = "ababb";
        System.out.println(repeatedSubstringPattern(s2));
    }
}
