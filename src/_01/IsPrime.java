package _01;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        boolean isPrime = isPrime(n);
        System.out.print(isPrime ? "n is Prime" : "n is not prime");
    }

    static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
