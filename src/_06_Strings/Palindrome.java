package _06_Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        boolean ispalindrom = isPalindrome(str);
        if (ispalindrom){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("Not a palindrome!");
        }

    }

    public static boolean isPalindrome(String str){

        int len = str.length();
        for (int i =0;i<len/2;i++){
            if (str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
