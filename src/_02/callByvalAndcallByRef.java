package _02;

public class callByvalAndcallByRef {
    public static void main(String[] args) {


//        swap
        int a = 5;
        int b = 10;

        swap(a,b);    // call by value (java always supports call by value)
        System.out.println("Inside main function: a = "+a+", b = "+b);
    }


    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a+", b = "+b);
    }
}
