package hard;

import java.util.HashMap;


public class Problem432 {

    static class Node {
        String key;
        int count;
        Node next;
        Node prev;

        public Node(String s, int n) {
            key = s;
            count = n;
            next = null;
            prev = null;
        }
    }

    static class AllOne {

        private HashMap<String, Node> nodes;
        private Node head;
        private Node tail;

        public AllOne() {
            nodes = new HashMap<>();
            head = new Node("", Integer.MIN_VALUE);
            tail = new Node("", Integer.MAX_VALUE);
            head.next = tail;
            tail.prev = head;
        }

        private void swap(Node a, Node b) {
            Node bNext = b.next;
            Node aPrev = a.prev;

            aPrev.next = b;
            b.prev = aPrev;
            b.next = a;
            a.prev = b;
            a.next = bNext;
            bNext.prev = a;
        }

        private void delete(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void updateInc(Node n) {
            while (n.next != tail && n.count > n.next.count) {
                swap(n, n.next);
            }
        }

        private void updateDec(Node n) {
            while (n.prev != head && n.count < n.prev.count) {
                swap(n.prev, n);
            }
        }

        public void inc(String key) {
            Node n;
            if (!nodes.containsKey(key)) {
                n = new Node(key, 1);
                n.next = head.next;
                n.prev = head;
                head.next.prev = n;
                head.next = n;
                nodes.put(key, n);
            } else {
                n = nodes.get(key);
                n.count++;
                updateInc(n);
            }
        }

        public void dec(String key) {
            Node n = nodes.get(key);
            if (n == null) return;

            if (n.count == 1) {
                nodes.remove(key);
                delete(n);
            } else {
                n.count--;
                updateDec(n);
            }
        }

        public String getMaxKey() {
            return head.next == tail ? "" : tail.prev.key;
        }

        public String getMinKey() {
            return head.next == tail ? "" : head.next.key;
        }
    }
}
