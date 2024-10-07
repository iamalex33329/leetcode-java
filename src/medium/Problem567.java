package medium;

import java.util.ArrayList;

public class Problem567 {

    public boolean checkInclusion(String s1, String s2) {

        ArrayList<String> perm = getPermutations(s1);

        for (String p : perm) {
            if (s2.contains(p)) return true;
        }

        return false;
    }

    private ArrayList<String> getPermutations(String str) {
        ArrayList<String> result = new ArrayList<>();

        if (str.isEmpty()) {
            result.add(""); // 基本情況: 空字串的排列就是空
            return result;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            for (String perm : getPermutations(remaining)) {
                result.add(ch + perm);
            }
        }

        return result;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();

        if (n1 > n2) return false;

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < n1; i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        if (matches(a, b)) return true;

        for (int i = 0; i < n2 - n1; i++) {
            int left = s2.charAt(i) - 'a';
            int right = s2.charAt(i + n1) - 'a';

            b[left]--;
            b[right]++;

            if (matches(a, b)) return true;
        }

        return false;
    }


    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
