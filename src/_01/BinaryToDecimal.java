package _01;

import java.util.Scanner;

public class BinaryToDecimal {

    static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum/=10;
        }

        System.out.print("Decimal of the given binary is "+decNum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary Number: ");
        int n = s.nextInt();
        if (isBinary(n)) {
            binToDec(n);
        } else {
            System.out.println("Invalid binary number!");
        }
    }
    static boolean isBinary(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit > 1) return false;
            num /= 10;
        }
        return true;
    }

}
