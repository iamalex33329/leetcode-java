package easy;

import classes.ListNode;

public class Problem21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode();

        ListNode currentNode = result;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    currentNode.next = new ListNode(list1.val, null);
                    currentNode = currentNode.next;
                    list1 = list1.next;
                } else {
                    currentNode.next = new ListNode(list2.val, null);
                    currentNode = currentNode.next;
                    list2 = list2.next;
                }
            } else if (list1 != null && list2 == null) {
                currentNode.next = new ListNode(list1.val, null);
                currentNode = currentNode.next;
                list1 = list1.next;
            } else if (list1 == null && list2 != null) {
                currentNode.next = new ListNode(list2.val, null);
                currentNode = currentNode.next;
                list2 = list2.next;
            } else {
                break;
            }
        }
        return result.next;
    }

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null){
            if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        return (list1 == null) ? list2 : list1;
    }
}
