package _02.patterns;

public class InvertedhalfPyramidNumbers {
    public static void main(String[] args) {
        invertedhalfNumPyramid(5);
    }
    static void invertedhalfNumPyramid(int rows){
        for (int i = 1;i<=rows;i++){
            int start = 1;
            for (int j = 1;j<=(rows-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
