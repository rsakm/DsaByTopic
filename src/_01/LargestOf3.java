package _01;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter all the three numberx: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("The largest number is: "+largestOf3(a,b,c));

    }


    static int largestOf3(int a, int b, int c){
        if ((a >= b) && (a> c)){
            return a;
        }else if (b > c){
            return b;
        }
        return c;
    }
}
