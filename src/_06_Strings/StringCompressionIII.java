package _06_Strings;

/*
*
* leetcode 3163
* 
* */
public class StringCompressionIII {

    public static String compressedString(String word) {

        StringBuilder sb = new StringBuilder("");
        int n = word.length();

        for(int i =0;i<n;i++){
            Integer count = 1;

            while(i < n-1 && word.charAt(i)== word.charAt(i+1) && count < 9){
                count++;
                i++;
            }
            sb.append(count.toString()).append(word.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(str));
    }
}
