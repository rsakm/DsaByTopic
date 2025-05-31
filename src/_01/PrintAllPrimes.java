package _01;

import java.util.Scanner;

public class PrintAllPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = s.nextInt();
        primesInRange(n);
    }

    static void primesInRange(int n){
        for(int i = 1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
