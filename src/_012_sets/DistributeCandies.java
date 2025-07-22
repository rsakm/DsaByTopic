package _012_sets;

/*Leetcode: 575. Distribute Candies
*
* Alice has n candies, where the ith candy is of type candyType[i].
* Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
* Alice likes her candies very much, and she wants to eat the maximum number of different
* types of candies while still following the doctor's advice.

Given the integer array candyType of length n, return the maximum number of different
* types of candies she can eat if she only eats n / 2 of them.


 * */

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
