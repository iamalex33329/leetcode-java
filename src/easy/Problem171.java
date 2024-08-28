package easy;

public class Problem171 {

    public int titleToNumber(String columnTitle) {
        int nOfDigit = columnTitle.length() - 1;

        double result = 0;

        for (char c : columnTitle.toCharArray()) {
            result += (c - 'A' + 1) * Math.pow(26, nOfDigit--);
        }
        return (int) result;
    }

    public int titleToNumber2(String columnTitle) {
        int result = 0;
        int i = 0;

        while (i < columnTitle.length()) {
            result *= 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
            i++;
        }
        return result;
    }
}
