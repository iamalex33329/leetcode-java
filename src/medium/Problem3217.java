package medium;

import classes.ListNode;


public class Problem3217 {

    public ListNode modifiedList(int[] nums, ListNode head) {
        int[] seen = new int[100001];
        for (int num : nums) seen[num] += 1;

        ListNode headCurr = head;

        ListNode result = new ListNode();
        ListNode resultCurr = result;

        while (headCurr != null) {
            if (seen[headCurr.val] == 0) {
                resultCurr.next = new ListNode(headCurr.val);
                resultCurr = resultCurr.next;
            }
            headCurr = headCurr.next;
        }
        return result.next;
    }
}
