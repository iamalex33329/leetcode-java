package easy; 

import classes.ListNode;

import java.util.HashSet;

public class Problem141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        HashSet<ListNode> set = new HashSet<>();
        while (head.next != null) {
            if (set.contains(head.next)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /* 利用跑道的概念，速度快的終究會追到速度慢的，所以fast一次跨兩個node，若有cycle必定會遇到slow */
    public boolean hasCycle1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }
}