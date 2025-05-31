package _03Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 14;
        int idx = binarySearch(num,key);
        if(idx >=0 ){
            System.out.println("Found at "+idx);
        }else {
            System.out.println("Not found!");
        }
    }

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;



        while (left <= right){
//            int mid = (left + right)/2;

            int mid = left + (right - left) / 2;    /// to avoid overflow for large size of left or right

            if(arr[mid] == target){

                return mid;
            } else if (arr[mid] >  target) {
                right = mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
}
