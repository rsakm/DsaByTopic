package _02.patterns;

public class HollowRhombus {
    public static void main(String[] args) {

        printHollowRhombus(5);
    }

    static void printHollowRhombus(int n){

        for (int i =1;i<=n;i++){

//            Spaces
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

//            Stars
            for (int j =1;j<=n;j++){
                if (i == 1|| i==n||j==1||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

    }
}
