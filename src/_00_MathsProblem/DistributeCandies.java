package _00_MathsProblem;

import java.util.Arrays;

public class DistributeCandies {
    public static int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        int give = 1;

        while (candies > 0) {
            int index = i % num_people;
            int toGive = Math.min(give, candies);
            result[index] += toGive;
            candies -= toGive;
            give++;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        int candies = 10;
        int num_people = 3;

        int[] result = distributeCandies(candies, num_people);

        System.out.println("Candies Distribution: " + Arrays.toString(result));
    }
}
