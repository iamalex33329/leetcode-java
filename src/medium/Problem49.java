package medium;

import java.util.*;

public class Problem49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> strsMap = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            HashMap<Character, Integer> strMap = new HashMap<>();
            for (char c : strs[i].toCharArray()) {
                if (strMap.containsKey(c)) {
                    strMap.put(c, strMap.get(c)+1);
                } else {
                    strMap.put(c, 0);
                }
            }

            if (strsMap.containsKey(strMap)) {
                List<String> tmpList = strsMap.get(strMap);
                tmpList.add(strs[i]);
                strsMap.put(strMap, tmpList);
            } else {
                List<String> tmpList = new ArrayList<>();
                tmpList.add(strs[i]);
                strsMap.put(strMap, tmpList);
            }
        }

        return new ArrayList<>(strsMap.values());
    }

    /* Better Solution */
    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String, List<String>> strsMap = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            char[] alphabet = new char[26];
            for (char c : strs[i].toCharArray()) {
                alphabet[c - 'a']++;
            }

            List<String> tmpList;
            if (strsMap.containsKey(String.valueOf(alphabet))) {
                tmpList = strsMap.get(String.valueOf(alphabet));
            } else {
                tmpList = new ArrayList<>();
            }

            tmpList.add(strs[i]);
            strsMap.put(String.valueOf(alphabet), tmpList);
        }

        return new ArrayList<>(strsMap.values());
    }
}
