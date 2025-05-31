package _05_2DArray;

public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int key = 11;
        stairCaseSearch(matrix,key);
    }

    public static boolean stairCaseSearch(int matrix[][], int key){

        int row = 0, col = matrix[0].length-1;   ///(0,m-1)   ---> top right corner

        while (row < matrix.length && col >=0){

            if (matrix[row][col] == key){
                System.out.println("Found "+key +" at ("+ row + ","+col+")");
                return true;
            }
            else if (key < matrix[row][col]){
//                left
                col--;
            }else {
//                bottom
                row++;
            }
        }
        System.out.println("Not found!");
        return false;
    }
}
