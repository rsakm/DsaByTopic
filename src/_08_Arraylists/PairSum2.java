package _08_Arraylists;

import java.util.ArrayList;

/*
* Given a rotated and sorted arraylist, to find whether a pair to sum the target is present in the al or not
*
* */
public class PairSum2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        System.out.println(al);
        System.out.println(pairSum2(al,16));

    }


    public static boolean pairSum2(ArrayList<Integer> al, int target){

        int n = al.size();
        int pivot = -1;

        for (int i =0;i<n;i++){
            if (al.get(i) > al.get(i+1)){
                pivot = i;
                break;
            }
        }

        int lp = pivot+1, rp = pivot;
        while (lp != rp){
            if (al.get(lp) + al.get(rp) == target){
                return true;
            } else if (al.get(lp) + al.get(rp) > target) {
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }

        return false;
    }
}
