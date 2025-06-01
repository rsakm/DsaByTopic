package _07_recursion;

public class Print1toN {
    public static void main(String[] args) {
        printincreasing(10);
    }

    public static void printincreasing(int n){
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
    }
}
