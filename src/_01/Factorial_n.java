package _01;

public class Factorial_n {
    public static void main(String[] args) {

    }

    static long findFactorial(int n){
        long fac = 1;
        for (int i =1;i<= n;i++){
            fac*=i;
        }
        return fac;
    }
}
