package medium;

import java.util.*;

public class Problem347 {

    public int[] topKFrequent(int[] nums, int k) {

        // 把所有key的頻率建成 map O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) { map.put(num, map.getOrDefault(num, 0) + 1); }

        // 根據頻率來建立一個 key 的 max heap O(nlogn)
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int key : map.keySet()) { heap.add(key); }

        // 從 root 開始取得頻率前k多的key O(k)
        int[] results = new int[k];
        for (int i=0; i<k; i++) { results[i] = heap.poll(); }

        // O(nlogn)
        return results;
    }
}
