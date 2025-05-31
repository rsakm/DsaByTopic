package _06_Strings;

import java.util.Scanner;

public class SubString {
    public static String printSubString(String str, int si, int ei){

//        String subStr = "";
//        for (int i = si;i<ei;i++){
//            subStr+=str.charAt(i);
//        }

        StringBuilder subStr = new StringBuilder("");
        for (int i= si; i<ei;i++){
            subStr.append(str.charAt(i));
        }

        return subStr.toString();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();

        System.out.println("Enter the stating and ending indices for the substring: ");
        int si = s.nextInt();
        int ei = s.nextInt();

        System.out.println("The required substring is: "+printSubString(str,si,ei));
    }
}
