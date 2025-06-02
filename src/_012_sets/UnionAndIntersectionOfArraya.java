package _012_sets;

import java.util.HashSet;

public class UnionAndIntersectionOfArraya {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> hs = new HashSet<>();

//        Union
        for (int i =0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for (int i =0;i< arr2.length;i++){
            hs.add(arr2[i]);
        }

        int union = hs.size();

//        Intersection
        hs.clear();
        for (int i =0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        int count = 0;
        for (int i =0;i< arr2.length;i++){
            if (hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }

        int intersection = count;

        System.out.println(union);
        System.out.println(intersection);
    }
}
