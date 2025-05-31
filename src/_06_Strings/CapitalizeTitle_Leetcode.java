package _06_Strings;


/*

2129. Capitalize the Title

 Capitalize the string by changing the capitalization of each word such that:

If the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title.
*
* */
public class CapitalizeTitle_Leetcode {

    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");    //// Array of words
        StringBuilder sb = new StringBuilder("");     //// New string to store the result

        for(int i =0;i<words.length; i++){
            String word = words[i];

            // Checking for the length of word for givwn rule
            if(word.length()<=2){
                sb.append(word.toLowerCase());
            }else{
                sb.append(Character.toUpperCase(word.charAt(0))); //// Append the capital of first letter of the word
                sb.append(word.substring(1).toLowerCase());    /// rest substring of the word in lower case
            }

            if(i < words.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}
