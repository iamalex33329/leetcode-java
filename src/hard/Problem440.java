package hard;

import java.util.ArrayList;
import java.util.List;

public class Problem440 {

    public int findKthNumber(int n, int k) {
        return getLexicographicalOrder(n).get(k - 1);
    }

    private List<Integer> getLexicographicalOrder(int n) {

        List<Integer> list = new ArrayList<>();

        int curr = 1;

        for (int i=0; i<n; i++) {

            list.add(curr);

            if (curr * 10 <= n) {
                curr *= 10;
            } else {
                if (curr >= n) curr /= 10;

                curr++;

                while (curr % 10 == 0) {
                    curr /= 10;
                }
            }
        }
        return list;
    }

    public int findKthNumber2(int n, int k) {
        long num = 1;
        for (int i = 1; i < k;) {
            int req = getReqNum(num, num + 1, n);
            if (i + req <= k) {
                i += req;
                num++;
            } else {
                i++;
                num *= 10;
            }
        }
        return (int) num;
    }

    private int getReqNum(long a, long b, long n) {
        int gap = 0;
        while (a <= n) {
            gap += (int) (Math.min(n + 1, b) - a);
            a *= 10;
            b *= 10;
        }
        return gap;
    }
}
