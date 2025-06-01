package _07_recursion;

public class lastOccurrenceInArray {
    public static void main(String[] args) {

    }

    public static int lastOccurrence(int arr[], int key, int i){

        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccurrence(arr,key,i+1);

        if (isFound != -1){
            return isFound;
        }

        if (arr[i] == key){
            return i;
        }

        return isFound;
    }
}
