package _012_sets;

import java.util.HashSet;

public class DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        int maxSheCanEat = candyType.length / 2;
        return Math.min(set.size(), maxSheCanEat);
    }

    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
