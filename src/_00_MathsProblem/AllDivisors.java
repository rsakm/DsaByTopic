package _00_MathsProblem;

public class AllDivisors {
    public static void printAllDivisors(int n){
        for (int i =1;i<=n;i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printAllDivisors(8);
        printAllDivisors(7);
        printAllDivisors(21);
    }
}
