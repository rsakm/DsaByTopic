package _06_Strings;


/*
Leetcode : 680. Valid Palindrome II

* Given a string s, return true if the s can be palindrome after deleting at most one character from it.
*
* */
public class ValidPalindrom_2 {
    public static boolean validPalindrome(String s) {
        return isValid(s, 0, s.length() - 1, true);
    }

    private static boolean isValid(String s, int left, int right, boolean canDelete) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (!canDelete) {
                    return false;
                }
                // Try skipping left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
