package medium;

import java.util.ArrayList;


public class Problem641 {

    static class MyCircularDeque {

        ArrayList<Integer> queue;
        int capacity;

        public MyCircularDeque(int k) {
            this.queue = new ArrayList<>();
            this.capacity = k;
        }

        public boolean insertFront(int value) {
            if (queue.size() == capacity) return false;

            this.queue.addFirst(value);
            return true;
        }

        public boolean insertLast(int value) {
            if (queue.size() == capacity) return false;

            this.queue.add(value);
            return true;
        }

        public boolean deleteFront() {
            if (queue.isEmpty()) return false;

            queue.removeFirst();
            return true;
        }

        public boolean deleteLast() {
            if (queue.isEmpty()) return false;

            queue.removeLast();
            return true;
        }

        public int getFront() {
            if (queue.isEmpty()) return -1;

            return queue.getFirst();
        }

        public int getRear() {
            if (queue.isEmpty()) return -1;

            return queue.getLast();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public boolean isFull() {
            return queue.size() == capacity;
        }
    }
}
