package medium;

public class Problem2433 {
    public int[] findArray(int[] pref) {

        int[] results = new int[pref.length];

        results[0] = pref[0];
        for (int i=1; i<pref.length; i++) { results[i] = pref[i-1] ^ pref[i]; }

        return results;
    }
}
