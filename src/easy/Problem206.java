package easy; 

import classes.ListNode;

public class Problem206 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode tmp = new ListNode(head.val, null);
            tmp.next = newHead;
            newHead = tmp;

            head = head.next;
        }
        return newHead;
    }
}
