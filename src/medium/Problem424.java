package medium;

public class Problem424 {

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int largestCount = 0, left = 0, max = 0;
        for(int right = 0; right < s.length(); right++){
            largestCount = Math.max(largestCount, ++arr[s.charAt(right) - 'A']);

            while (right - left + 1 - largestCount > k) { arr[s.charAt(left++) - 'A']--; }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
