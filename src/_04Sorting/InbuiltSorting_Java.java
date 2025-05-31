package _04Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting_Java {
    public static void main(String[] args) {

        int arr[]= {5,4,1,3,2};

        Arrays.sort(arr);

        Test t = new Test();
        t.printArray(arr);


        int arr2[]={3,7,2,59,6,3,90};
        Arrays.sort(arr2,2,5);
        t.printArray(arr2);     ////  3 7 2 6 59 3 90


//        For descending order, java provides the use of Collections and wrapper class
        Integer arrInt[] = {9,5,8,3,6,2,1};
        Arrays.sort(arrInt, Collections.reverseOrder());
        for (int i = 0;i<arrInt.length;i++){
            System.out.print(arrInt[i]+" ");
        }


        Arrays.sort(arrInt,2,6,Collections.reverseOrder());
    }


}
