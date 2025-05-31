package _02.patterns;

public class Zero_One_Triangle {
    public static void main(String[] args) {
        zeroOneTriangle(5);
    }

    static void zeroOneTriangle(int n){
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                if((i + j)%2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
