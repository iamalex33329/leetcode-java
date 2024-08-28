package medium;

import java.util.*;

public class Problem15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> sets = new HashSet<>();
        List<List<Integer>> lists = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            int m = i+1;
            int n = nums.length-1;

            while (m < n) {
                int sum = nums[i] + nums[m] + nums[n];
                if (sum == 0) {
                    sets.add(Arrays.asList(nums[i], nums[m], nums[n]));
                    m++;  n--;
                }
                else if (sum < 0) { m++; }
                else { n--; }
            }
        }
        lists.addAll(sets);
        return lists;
    }
}
