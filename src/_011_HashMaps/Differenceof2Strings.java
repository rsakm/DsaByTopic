package _011_HashMaps;

import java.util.HashMap;

public class Differenceof2Strings {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in string s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the extra character in string t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return c; // This is the extra character
            }
            map.put(c, map.get(c) - 1);
        }

        // This line should never be reached if input is valid
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("", "R"));
        System.out.println(findTheDifference("Rajshree", "Rjsharee"));
        System.out.println(findTheDifference("Rajshree", "RjshareeMaurya"));   ////first extra char
        System.out.println(findTheDifference("Rajshree", "RpjshareeMaurya"));  ///p
    }
}
