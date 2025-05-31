package _06_Strings;

import java.util.Scanner;

public class ShortestPath {

    public static float getShortestPath(String path){
        int x =0, y=0;
        int len = path.length();

        for (int i = 0;i<len;i++){
            if (path.charAt(i)== 'N'){
                y++;
            } else if (path.charAt(i)=='S') {
                y--;
            }else if (path.charAt(i)=='E'){
                x++;
            }else {
                x--;
            }
        }

        int X2 = (x-0)*(x-0);
        int Y2 = (y-0)*(y-0);
        return (float) Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the path String: ");
        String path = s.next();

        System.out.println("Shortest path is: "+getShortestPath(path));
    }
}
