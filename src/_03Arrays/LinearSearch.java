package _03Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = {1,4,8,2,3,8};
        int key = 8;
        System.out.println(linearSearch(array, key));
    }

    static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for (int i =0;i<n;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
