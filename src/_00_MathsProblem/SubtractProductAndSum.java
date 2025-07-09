package _00_MathsProblem;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(subtractProductAndSum(456));
    }
}
