package _00_MathsProblem;

import java.util.Scanner;

public class NthFibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = s.nextInt();
        System.out.println("The fibonacci term is : "+fib(n));
    }
}
