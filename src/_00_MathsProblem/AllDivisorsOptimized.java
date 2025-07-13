package _00_MathsProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AllDivisorsOptimized {
    public static void printAllDivisors(int n){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i*i<=n;i++){
            if (n % i == 0){
//                System.out.print(i+" ");
                list.add(i);

                if (n/i != i){
//                    System.out.print(n/i+" ");
                    list.add(n/i);
                }
            }
        }

//        list.sort(null);      /// OR
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        printAllDivisors(8);
        printAllDivisors(21);
        printAllDivisors(7);
    }
}
