package _08_Arraylists;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        ArrayList<Integer> heigth = new ArrayList<>();
        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);

        System.out.println(maxWater(heigth));
        System.out.println(maxStoredWater(heigth));


    }


//    Brute force
    public static int maxWater(ArrayList<Integer> height){
        int maxWater = 0;

        int n = height.size();
        for (int i =0;i<n;i++){
            int water = 0;
            for (int j = i+1;j<n;j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                water = ht * width;
                maxWater = Math.max(water, maxWater);
            }
        }

        return maxWater;
    }

//    Two pointer Approach
    public static int maxStoredWater(ArrayList<Integer> height){

        int maxWater = 0;
        int n = height.size();
        int lp = 0;
        int rp = n-1;

        while (lp<rp){

//            Water area
            int width = rp-lp;
            int ht = Math.min(height.get(lp),height.get(rp));
            int water = width*ht;
            maxWater = Math.max(water,maxWater);

//            Update pointer
            if (height.get(lp) < height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }

        return maxWater;
    }


}
