package _03Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6};
        reverseArray(nums);
        for (int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
//    Swap first to last and so on

    static int[] reverseArray(int[] arr){

        int start = 0;
        int last = arr.length-1;

        int n = arr.length;

        while (start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        return arr;
    }
}
