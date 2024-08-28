package easy;

public class Problem1614 {

    public int maxDepth(String s) {

        int result = 0, pair = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') pair++;
            else if (c == ')') pair--;

            result = Math.max(result, pair);
        }

        return result;
    }
}
