package hard;

import classes.ListNode;

import java.util.*;

public class Problem23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();

        for (ListNode node : lists) {
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
        }
        list.sort(Comparator.naturalOrder());

        ListNode result = new ListNode();
        ListNode tail = result;
        for (int i : list) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        return result.next;
    }

    /* minHeap會拿每條lists的首位來做PQ，比對完每條首位之後，把head最小的list再加回PQ */
    public ListNode mergeKLists1(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((o1, o2) -> o1.val-o2.val);
        for (ListNode node : lists) {
            if (node != null) { minHeap.add(node); }
        }
        ListNode head = new ListNode();
        ListNode tail = head;

        while (!minHeap.isEmpty()) {
            tail.next = minHeap.remove();
            tail = tail.next;

            if (tail.next != null) minHeap.add(tail.next);
        }
        return head.next;
    }
}
