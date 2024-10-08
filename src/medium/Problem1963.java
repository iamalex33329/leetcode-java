package medium;

public class Problem1963 {

    public int minSwaps(String s) {
        int stack = 0;
        int swap = 0;

        for (var c : s.getBytes()) {
            if (c == '[') stack++;
            else if (c == ']' && stack == 0) {
                swap++;
                stack++;
            }
            else stack--;
        }

        return swap;
    }
}
