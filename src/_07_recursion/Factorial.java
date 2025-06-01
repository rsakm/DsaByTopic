package _07_recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(printFactorial(6));
    }
    public static int printFactorial(int n){

        if (n == 0){
            return 1;
        }

        return n*printFactorial(n-1);

    }
}
