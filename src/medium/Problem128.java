package medium;

import java.util.HashSet;
import java.util.Set;

public class Problem128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) { set.add(num); }

        int length = 0;
        for (int num : nums) {
            int count = 1;

            while (set.remove(--num)) { count++; }
            while (set.remove(++num)) { count++; }

            length = (count > length) ? count : length;
        }
        return length;
    }
}
