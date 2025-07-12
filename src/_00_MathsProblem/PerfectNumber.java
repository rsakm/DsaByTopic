package _00_MathsProblem;

/*Leetcode: 507. Perfect Number

* A perfect number is a positive integer that is equal to the sum of its positive divisors,
* excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.
*
* */
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1; // 1 is always a proper divisor

        // Check divisors up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
    }
}
