package _04Sorting;

public class Test {
    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();

        int arr[] = {5,4,1,2,3};
//        bs.bubbleSort(arr);
//        printArray(arr);

//        SelectionSort ss = new SelectionSort();
//        ss.selectionSort(arr);

//        InsertionSort is = new InsertionSort();
//        is.insertionSort(arr);

        CountingSort cs = new CountingSort();
        cs.countingSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
