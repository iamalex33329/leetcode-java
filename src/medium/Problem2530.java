package medium;

import java.util.PriorityQueue;

public class Problem2530 {

    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int score = 0;

        for (int num : nums) { maxHeap.offer(num); }

        while (k-- > 0) {
            int current = maxHeap.poll();
            score += current;
            maxHeap.offer((current + 2) / 3);
        }

        return score;
    }
}
