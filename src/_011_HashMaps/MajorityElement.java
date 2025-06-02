package _011_HashMaps;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,1,3,1,5,1};
        printMajorityElements(arr);

    }

    public static void printMajorityElements(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i =0;i<arr.length;i++){

//            int num = arr[i];
//            if (hm.containsKey(num)){
//                hm.put(num, hm.get(num)+1);
//            }else{
//                hm.put(num,1);
//            }


//            OR
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

//        int n = arr.length;
//        Set<Integer> keySet = hm.keySet();
//        for (Integer key:keySet){
//            if (hm.get(key) >= n/3){
//                System.out.print(key+" ");
//            }
//        }


//        OR
        for (Integer key : hm.keySet()){
            if (hm.get(key) >= arr.length/3){
                System.out.print(key+" ");
            }
        }
    }
}
