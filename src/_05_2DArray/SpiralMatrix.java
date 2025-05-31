package _05_2DArray;

public class SpiralMatrix {
    public static void main(String[] args) {

        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        printSpiral(matrix);

    }

    public static void printSpiral(int[][] mat){
        int startRow =0, endRow = mat.length-1;
        int startCol = 0, endCol = mat[0].length-1;


        while (startRow <= endRow && startCol <= endCol){

//            top   ---> Row fixed(startRow), col increases
            for (int col = startCol; col <=endCol;col++){
                System.out.print(mat[startRow][col]+" ");
            }

//            Right ---> col fixed (endCol) row increases
            for (int row = startRow+1; row<=endRow;row++){
                System.out.print(mat[row][endCol]+" ");
            }

//            Bottom ---> row(endRow) fixed, col(decreases)
            for (int col= endCol-1;col>=startCol;col--){

//                Edge cases for odd number of rows
                if (startRow == endRow){
                    break;
                }
                System.out.print(mat[endRow][col]+" ");
            }

//            left ---> col(startCol) fixed and row(decreases)
            for (int row = endRow-1;row>=startRow+1;row--){

//                Edge cases in case of odd number of cols
                if (startCol == endCol){
                    break;
                }
                System.out.print(mat[row][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

            System.out.println();

        }

    }
}
