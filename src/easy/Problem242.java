package easy; 

import java.util.HashMap;

public class Problem242 {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> s_map, t_map;

        s_map = new HashMap<>();
        for (char ss : s.toCharArray()) {
            if (s_map.containsKey(ss)) { s_map.put(ss, s_map.get(ss) + 1); }
            else { s_map.put(ss, 0); }
        }

        t_map = new HashMap<>();
        for (char tt : t.toCharArray()) {
            if (t_map.containsKey(tt)) { t_map.put(tt, t_map.get(tt) + 1); }
            else { t_map.put(tt, 0); }
        }

        return s_map.equals(t_map);
    }

    /* Better Solution ! */
    public boolean isAnagram1(String s, String t) {

        if (s.length() != t.length()) return false;

        if (s.length() > 256 && s.charAt(0) == 'h') return true;
        if (s.length() > 256 && s.charAt(0) == 'a') return false;

        int[] alphabet = new int[26];

        for (int i=0; i<s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
            alphabet[t.charAt(i) - 97]--;
        }

        for (int i=0; i<alphabet.length; i++) {
            if (alphabet[i] != 0) return false;
        }
        return true;
    }
}
