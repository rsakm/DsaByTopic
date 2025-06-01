package _08_Arraylists;

import java.util.ArrayList;

public class ReverseArrayList {
    public static ArrayList<Integer> reverse(ArrayList<Integer> al){
        int n = al.size();
        ArrayList<Integer> rev = new ArrayList<>();

        System.out.println(al);
        for (int i = n-1;i>=0;i--){
            rev.add(al.remove(i));
        }

        return rev;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0;i<5;i++){
            al.add(i);
        }

        System.out.println(reverse(al));
    }
}
