package _02.patterns;

public class Butterfly {
    public static void main(String[] args) {
        butterfly(4);
    }
    static void butterfly(int n){
//        Upper Half
        for (int i =1;i<=n;i++){

//            Stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }

//            Spaces
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //            Stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }

//            Change Line
            System.out.println();
        }

//        Lower Part
        for (int i =n;i>=1;i--){
//            Stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }

//            Spaces
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }


            //            Stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
