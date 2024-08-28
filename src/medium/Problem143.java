package medium;

import classes.ListNode;

import java.util.ArrayList;

public class Problem143 {

    public void reorderList(ListNode head) {
        ListNode tmp = head, tmp1 = head;

        ArrayList<Integer> list = new ArrayList<>();

        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }

        int l=0, r=list.size()-1;

        for (int i=0; i<list.size(); i++) {
            if (i % 2 == 0) { tmp1.val = list.get(l++); }
            else { tmp1.val = list.get(r--); }
            tmp1 = tmp1.next;
        }
    }
}
