package medium;

public class Problem2938 {

    public long minimumSteps(String s) {
        long result = 0;
        int black = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') result += black;
            else black++;
        }

        return result;
    }
}
