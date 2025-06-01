package _07_recursion;

public class XpowN {
    public static void main(String[] args) {

        System.out.println(xpowN_optimized(3,4));

    }

    public static int xPowN(int x, int n){

        if (n == 0){
            return 1;
        }

        return x * xPowN(x,n-1);

    }

    public static int xpowN_optimized(int x, int n){

        if (n == 0){
            return 1;
        }

        int halfPow = xpowN_optimized(x,n/2);
        int halfPowSq  = halfPow* halfPow;

        if (n % 2 !=0 ){
            return x*halfPowSq;
        }

        return halfPowSq;
    }
}
