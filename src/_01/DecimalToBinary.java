package _01;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();

        decToBin(num);

    }

    static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while (n>0){
            int rem = n%2;
            binNum = binNum+(rem * (int)Math.pow(10,pow));
            pow++;
            n/=2;
        }

        System.out.println(binNum);
    }
}
