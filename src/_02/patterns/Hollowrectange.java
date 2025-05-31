package _02.patterns;

import java.util.Scanner;

public class Hollowrectange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = s.nextInt();
        printHollowRectange(rows,cols);
    }

    static void printHollowRectange(int rows, int cols){

        for (int i =1;i<=rows;i++){
            for (int j = 1;j<=cols;j++){
                if (i==1||i==rows||j==1||j==cols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
