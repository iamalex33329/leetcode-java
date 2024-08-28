package medium; 

import classes.ListNode;

public class Problem1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail = list1;
        ListNode head = list1;

        for (int i=0; i < a-1; i++) {
            head = head.next;
        }

        for (int i = 0; i < b; i++) {
            tail = tail.next;
        }

        head.next = list2;

        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        list2Tail.next = tail.next;

        return list1;
    }
}
