package medium; 

import java.util.PriorityQueue;

public class Problem1845 {

    class SeatManager {

        PriorityQueue<Integer> freeQueue;

        public SeatManager(int n) {
            freeQueue = new PriorityQueue<>();
            for (int i=1; i<=n; i++) { freeQueue.add(i); }
        }

        public int reserve() {
            return freeQueue.poll();
        }

        public void unreserve(int seatNumber) {
            freeQueue.offer(seatNumber);
        }
    }

    class SeatManager1 {

        boolean[] seats;
        int reserved = 0;
        int min = 1;

        public SeatManager1(int n) {
            seats = new boolean[n+1];
        }

        public int reserve() {
            // 沒有人訂位
            if (reserved == 0) {
                seats[min] = true;
                return min++;
            }

            for (int i=1; i<seats.length; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    reserved++;
                    return i;
                }
            }
            return -1;
        }

        public void unreserve(int seatNumber) {
            seats[seatNumber] = false;
            reserved--;
        }
    }
}
