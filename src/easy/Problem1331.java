package easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1331 {

    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
