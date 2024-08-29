package easy;

import java.util.HashMap;

public class Problem205 {

    public boolean isIsomorphic(String s, String t) {

        int[] map1 = new int[200];
        int[] map2 = new int[200];

        for (int i=0; i<s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) return false;

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public boolean isIsomorphic1(String s, String t) {

        HashMap<Character, Character> mapper = new HashMap<>();

        for (int i=s.length()-1; i>=0; i--) {

            if (!mapper.containsKey(s.charAt(i))) {
                if (mapper.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    mapper.put(s.charAt(i), t.charAt(i));
                }
            } else {
                if (!mapper.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
        }

        return true;
    }
}
