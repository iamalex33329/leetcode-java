package easy;

import classes.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        Set<Integer> set = new HashSet<>();

        while (head != null) {
            set.add(head.val);
            head = head.next;
        }

        ListNode results = new ListNode();
        ListNode current = results;
        Object[] objects = set.toArray();
        Arrays.sort(objects);
        List<Object> list = Arrays.asList(objects);
        for (Object i : list) {
            ListNode tmp = new ListNode((Integer) i, null);
            current.next = tmp;
            current = tmp;
        }
        return results.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return (head.val == head.next.val) ? head.next : head;
    }
}
