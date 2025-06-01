package _07_recursion;

public class Nth_fibonacci {
    public static void main(String[] args) {
        System.out.println(nThFibonacci(8));
    }

    public static int nThFibonacci(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }

        return nThFibonacci(n-1)+nThFibonacci(n-2);
    }
}
