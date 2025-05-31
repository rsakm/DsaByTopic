package _03Arrays;

public class PrintSubArrays {
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        printSubArrays(nums);
    }

    static void printSubArrays(int[] arr){
        int n = arr.length;
        int totalSubArray = 0;
        for (int i =0;i<n;i++){
            int start = i;
            for (int j =i;j<n;j++){
                int end = j;

                for (int k = start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Number of subArrays = "+totalSubArray);
    }
}
