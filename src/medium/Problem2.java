package medium;

import classes.ListNode;

public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;

        boolean isCarry = false;

        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                sum = (isCarry) ? l1.val + l2.val + 1 : l1.val + l2.val;
                l1 = l1.next;  l2 = l2.next;
            } else if (l1 == null && l2 != null) {
                sum = (isCarry) ? l2.val + 1 : l2.val;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                sum = (isCarry) ? l1.val + 1 : l1.val;
                l1 = l1.next;
            }
            isCarry = false;

            if (sum > 9) isCarry = true;

            current.next = new ListNode(sum % 10, null);
            current = current.next;
        }

        if (isCarry) { current.next = new ListNode(1, null); }

        return result.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;

        boolean isCarry = false;

        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int sum = (isCarry) ? a + b + 1 : a + b;
            isCarry = sum > 9;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (isCarry) { current.next = new ListNode(1, null); }

        return result.next;
    }
}
