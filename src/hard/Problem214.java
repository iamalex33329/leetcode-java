package hard;

public class Problem214 {

    public String shortestPalindrome(String s) {
        String reverseS = new StringBuilder(s).reverse().toString();
        int count = kmp(s, reverseS);

        return new StringBuilder(s.substring(count)).reverse().append(s).toString();
    }

    private int kmp(String orig, String rev) {
        String combStr = orig + '#' + rev;

        int[] pi = new int[combStr.length()];
        int matchLen = 0;

        for (int i = 1; i < combStr.length(); i++) {
            // 如果當前字符不匹配，回退到上一個可能的匹配位置
            while (matchLen > 0 && combStr.charAt(i) != combStr.charAt(matchLen)) {
                matchLen = pi[matchLen - 1];
            }

            // 如果字符匹配，增加匹配的前綴長度
            if (combStr.charAt(i) == combStr.charAt(matchLen)) matchLen++;

            pi[i] = matchLen;  // 記錄當前前綴長度
        }

        return pi[combStr.length() - 1];
    }
}
