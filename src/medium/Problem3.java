package medium;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max=0, i=0, j=0;
        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return max;
    }
}
