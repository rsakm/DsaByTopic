package _01;

import java.util.Scanner;

public class binaryToDecImproved {

    static void binToDec(String binStr) {
        int decNum = 0;
        int pow = 0;

        // Start from the rightmost digit
        for (int i = binStr.length() - 1; i >= 0; i--) {
            char c = binStr.charAt(i);
            if (c == '1' || c == '0') {
                decNum += (c - '0') * Math.pow(2, pow);
                pow++;
            } else {
                System.out.println("Invalid binary digit: " + c);
                return;
            }
        }

        System.out.println("Decimal of the given binary is " + decNum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary Number: ");
        String binaryInput = s.nextLine(); // Use nextLine() to support long input

        binToDec(binaryInput);
    }
}
