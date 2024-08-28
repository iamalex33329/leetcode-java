package medium;

import java.util.ArrayList;
import java.util.List;

public class Problem442 {

    public List<Integer> findDuplicates(int[] nums) {
        int[] allNums = new int[nums.length+1];
        List<Integer> list = new ArrayList<>();

        for (int i : nums) { allNums[i] += 1; }

        for (int i=1; i<allNums.length; i++) {
            if (allNums[i] > 1) { list.add(i); }
        }

        return list;
    }
}
