package medium;

import java.util.Arrays;
import java.util.PriorityQueue;


public class Problem1942 {

    public int smallestChair(int[][] times, int targetFriend) {
        // 儲存目標朋友的到達時間
        int targetArrival = times[targetFriend][0];

        // 按照到達時間排序朋友
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < times.length; i++) availableChairs.offer(i);

        // 第一個元素是離開時間，第二個元素是椅子編號
        PriorityQueue<int[]> busyChairs = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int[] time : times) {
            // 可能會有人同時間離開
            while (!busyChairs.isEmpty() && busyChairs.peek()[0] <= time[0]) {
                availableChairs.offer(busyChairs.poll()[1]);
            }

            if (time[0] == targetArrival) return availableChairs.poll();

            busyChairs.offer(new int[]{time[1], availableChairs.poll()});
        }

        return -1;
    }
}
