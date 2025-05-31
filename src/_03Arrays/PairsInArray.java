package _03Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        printPairs(nums);
    }

    static void printPairs(int[] arr){
        int n = arr.length;
        int totalPairs = 0;
        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totalPairs++;
            }
            System.out.println();

        }
        System.out.println("Total pairs = "+totalPairs);
    }
}
