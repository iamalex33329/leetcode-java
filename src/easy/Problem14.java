package easy;

public class Problem14 {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) return strs[0];

        int minLength = Integer.MAX_VALUE;
        String minString = "";

        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
            minString = str;
        }

        if (minLength == 0) return "";

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<minLength; i++) {

            boolean allSame = true;

            for (int j=0; j<strs.length-1; j++) {
                allSame = allSame && (strs[j].charAt(i) == strs[j+1].charAt(i));
            }

            if (allSame) sb.append(minString.charAt(i));
            else return sb.toString();
        }

        return sb.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (String s : strs) {
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
}
