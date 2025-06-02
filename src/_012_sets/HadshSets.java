package _012_sets;

import java.util.HashSet;

public class HadshSets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);

        hs.add(3);
        hs.add(2);
        System.out.println(hs);

        System.out.println(hs.contains(2));
        System.out.println(hs.size());
        hs.remove(2);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs.isEmpty());
    }

}
