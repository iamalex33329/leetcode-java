package easy;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {

            int result = 0;
            while (n > 0) {
                result += (n % 10) * (n % 10);
                n /= 10;
            }

            if (result == 1) return true;

            if (set.contains(result)) return false;
            else set.add(result);
        }
    }
}
