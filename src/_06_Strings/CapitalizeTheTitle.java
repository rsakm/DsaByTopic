package _06_Strings;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String str = "Hi, i am rajshree";

        System.out.println(capitalizeTitle(str));
    }

    public static String capitalizeTitle(String title) {

        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(title.charAt(0)));

        for (int i =1;i<title.length();i++){
            if (title.charAt(i)==' ' && i<title.length()-1){
                sb.append(title.charAt(i));
                i++;
                sb.append(Character.toUpperCase(title.charAt(i)));
            }else{
                sb.append(title.charAt(i));
            }
        }

        return sb.toString();


    }


//    Helper function
////    public static String toUpperCase(String str){
////        StringBuilder sb = new StringBuilder("");
////
////
//    }


}
