package _01;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n){
        boolean res = true;
        if(n == 2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }

        return res;
    }
}
