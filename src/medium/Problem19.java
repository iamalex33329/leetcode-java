package medium;

import classes.ListNode;

import java.util.ArrayList;

public class Problem19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode tmp = head;
        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }

        list.remove(list.size() - n);
        tmp = head;
        for (int i=0; i<list.size(); i++) {
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;
        }

        return head.next;
    }

    /* 空間複雜度1而已，利用fast來當作檔板，讓slow可以來交換 */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}