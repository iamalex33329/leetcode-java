package medium;

import classes.ListNode;


public class Problem725 {

    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        // 計算 head 長度
        int listLength = 0;
        ListNode cur = head;
        while (cur != null) {
            listLength++;
            cur = cur.next;
        }

        // 計算陣列每一部分的大小和多餘的部分
        int base = listLength / k;
        int remainder = listLength % k;
        int partSize  = 0;

        cur = head;

        for (int i=0; i<k; i++) {
            result[i] = cur;
            partSize = base + (remainder > 0 ? 1 : 0);
            remainder--;

            for (int j=0; j<partSize-1; j++) {
                if (cur != null) cur = cur.next;
            }

            // 如果下一個不是空值，則把新的 cur 設為 next
            if (cur != null) {
                ListNode next = cur.next;
                cur.next = null;
                cur = next;
            }
        }
        return result;
    }
}
