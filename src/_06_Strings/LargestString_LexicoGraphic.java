package _06_Strings;

public class LargestString_LexicoGraphic {

    public static String getlargestString(String arr[]){

        String largest = arr[0];
        for (String str : arr){
            if (str.compareTo(largest) > 0){
                largest = str;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mangpo"};

        System.out.println("The largest string is: "+getlargestString(fruits));
    }
}
