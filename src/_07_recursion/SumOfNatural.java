package _07_recursion;

public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(printSumUpTo(10));
    }

    public static int printSumUpTo(int n){

        if (n == 1){
            return 1;
        }

        return n+ printSumUpTo(n-1);
    }
}
