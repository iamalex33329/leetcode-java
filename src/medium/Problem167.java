package medium;

import java.util.HashMap;

public class Problem167 {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i+1};
            }
            map.put(numbers[i], i+1);
        }
        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int l= 0;
        int r = numbers.length-1;

        while (l < r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                System.gc();
                return new int[] {l+1, r+1};
            }
        }
        return new int[] {};
    }
}