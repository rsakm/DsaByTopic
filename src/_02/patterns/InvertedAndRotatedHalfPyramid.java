package _02.patterns;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        invertedAndRotatedhalfPyramid(4);

    }
    static void invertedAndRotatedhalfPyramid(int rows){
        for (int i =1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
