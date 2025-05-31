package _05_2DArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int m1[][]={
                {1,2,3},{4,5,6},{7,8,9}
        };

        System.out.println(diagonalSumOptimized(matrix));
        System.out.println(diagonalSumOptimized(m1));
    }

    public static int diagonalSum(int[][] matrix){

        int sum =0;

        for (int i =0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){

//                Primary Diagonal ( i==j )
                if (i == j){
                    sum+= matrix[i][j];
                }
//                Secondary diagonal
                else if (i + j == matrix.length-1) {
                    sum+=matrix[i][j];
                }

            }
        }

        return sum;
    }


    public static int diagonalSumOptimized(int mat[][]){
        int sum =0;
        for (int i =0;i< mat.length;i++){

//            Primary diagonal
            sum+=mat[i][i] ;

//            secondary diagonal --> i+j = n-1   => j = n-i-1

            if (i != mat.length-1-i){   //// For i == j, we should avoid overlap
                sum += mat[i][mat.length-i-1];
            }

        }
        return sum;
    }
}
