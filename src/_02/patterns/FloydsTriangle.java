package _02.patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        floydsTriangle(5);
    }

    static void floydsTriangle(int n){
        int start = 1;
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}
