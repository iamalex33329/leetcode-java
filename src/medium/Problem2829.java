package medium; 

import java.util.HashSet;
import java.util.Set;

public class Problem2829 {

    public int minimumSum(int n, int k) {
        Set<Integer> disableNum = new HashSet<>();
        int sum = 0, a = 1;

        for (int i=0; i<n; i++) {
            while (disableNum.contains(a)) a += 1;
            disableNum.add(k - a);
            sum += a++;
        }
        return sum;
    }

    public int minimumSum2(int n, int k) {
        int a = k/2, sum = 0;

        if (a > n) {
            for (int i=0; i<n; i++) sum += i+1;
        } else {
            for (int i=0; i<a; i++) sum += i+1;
            for (int i=a; i<n; i++) sum += k++;
        }
        return sum;
    }
}
