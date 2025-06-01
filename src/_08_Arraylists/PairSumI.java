package _08_Arraylists;

import java.util.ArrayList;


//Given the arraylist is sorted. to check whether any pair in the sorted al has a target sum.
public class PairSumI {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();
        for (int i =1;i<=5;i++){
            al.add(i);
        }
        System.out.println(al);
        int target = 3;
        System.out.println(pairSum1TwoPointer(al,target));
    }

    public static boolean pairSumBruteForce(ArrayList<Integer> al, int target){

        int n = al.size();

        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (al.get(i) + al.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum1TwoPointer(ArrayList<Integer> al, int target){
        int n = al.size();
        int lp=0,rp=n-1;
        while (lp < rp){
            if (al.get(lp) + al.get(rp) == target){
                return true;
            }else if(al.get(lp) + al.get(rp) > target){
                rp--;
            }else {
                lp++;
            }
        }
        return false;
    }
}
