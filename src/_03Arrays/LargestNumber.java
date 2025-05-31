package _03Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        System.out.println(getLargestNum(num));

        int arr[] = {};
        System.out.println(getLargestNum(arr));
    }

    static int getLargestNum(int[] arr){
        int max = Integer.MIN_VALUE;

        if (arr.length <=0){
            return -1;
        }

        int n = arr.length;
        for (int i = 0;i<n;i++){
            max = Math.max(max,arr[i]);
        }

        return max;
    }
}
