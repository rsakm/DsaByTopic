package _07_recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        String str = "";
        printBinaryString(3,0,str);
//        printBinaryString(5,1,str);
    }

    public static void printBinaryString(int n, int lastPlace, String str ){

//        Base case

        if (n == 0){
            System.out.println(str);
            return;
        }

//        if lastplace is 0, we cann append either 0 or 1   --- lastplace will be 0 or 1 respectively
//        if last place is 1, append 0   ---> lastplace will be 1


        /*

        if (lastPlace == 0){
            printBinaryString(n-1,0,str.append("0"));
            printBinaryString(n-1,1,str.append("1"));
        }else {
            printBinaryString(n-1,0,str.append("0"));
        }


        */


//        Or

//        appending 0 in every case
        printBinaryString(n-1,0,str+"0");

//        appending 1 only when last place is 0
        if (lastPlace == 0){
            printBinaryString(n-1,1,str+"1");
        }

    }
}
