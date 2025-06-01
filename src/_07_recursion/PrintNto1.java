package _07_recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printNto1(10);
    }

    public static void printNto1(int n){

        if (n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);

    }
}
