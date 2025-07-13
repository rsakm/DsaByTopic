package _00_MathsProblem;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int num = n;
        int digits = String.valueOf(n).length();


//        OR

//        int digits = noOfDigits(n);
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, digits);
            n /= 10;
        }

        return sum == num;
    }

    private static int noOfDigits(int n){
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(12));
    }
}
