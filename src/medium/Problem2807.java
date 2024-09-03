package medium;

import classes.ListNode;


public class Problem2807 {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            int gcdValue = gcd(cur.val, cur.next.val);
            ListNode gcdNode = new ListNode(gcdValue);

            gcdNode.next = cur.next;
            cur.next = gcdNode;
            cur = cur.next.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
