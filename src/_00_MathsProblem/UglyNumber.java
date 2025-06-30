package _00_MathsProblem;


/*
*LeetCode 263: Ugly Number
*
* An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
* */

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        // Divide n by 2, 3, and 5 until it’s no longer divisible
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        // If only prime factors were 2, 3, 5, n should be reduced to 1
        return n == 1;
    }
}
