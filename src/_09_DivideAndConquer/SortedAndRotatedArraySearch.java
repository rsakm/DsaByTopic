package _09_DivideAndConquer;

public class SortedAndRotatedArraySearch {
    public static void main(String[] args) {
        int srr[] = {4,5,6,7,0,1,2};
        System.out.println("Given Array: ");
        printArray(srr);
        int target = 0;
        System.out.println("Target: "+target);
        System.out.println("Found in array at: "+search(srr,target));
    }
    public static int search(int arr[], int target){
        return searchHelper(arr,target,0,arr.length-1);
    }

    private static int searchHelper (int[] arr, int target, int si, int ei){

//        base case
        if(si > ei){
            return -1;
        }

        //        Finding mid
        int mid = si+(ei-si)/2;

//        case :  found
        if (arr[mid] == target){
            return mid;
        }

//        mid on line 1 (rotated sort6ed part)
        if(arr[si] <= arr[mid]){
//            case a: left of line 1
            if (arr[si] <= target && target <= arr[mid]){
                return searchHelper(arr,target,si,mid-1);
            }
            else {
                return searchHelper(arr,target,mid+1,ei);
            }
        }
//       mid on line 2 (in the left sorted part of array)
       else{
//            case a:  target on right of line 2
            if(arr[mid] <= target && target <= arr[ei]){
                return searchHelper(arr,target,mid+1,ei);
            }else {
                return searchHelper(arr,target,si,mid-1);
            }

        }
    }

    private static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }



}
