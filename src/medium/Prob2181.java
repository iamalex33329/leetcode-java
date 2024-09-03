package medium;

import classes.ListNode;


public class Prob2181 {

    public ListNode mergeNodes(ListNode head) {
        head = head.next;

        ListNode result = new ListNode(0);
        ListNode curr = result;
        int tmpSum = 0;

        while (head != null) {
            if (head.val != 0) {
                tmpSum += head.val;
            } else {
                curr.next = new ListNode(tmpSum);
                curr = curr.next;
                tmpSum = 0;
            }
            head = head.next;
        }
        return result.next;
    }
}
