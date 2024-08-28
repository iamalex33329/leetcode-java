package medium;

public class Problem151 {

    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = ss.length - 1; i >= 0; i--) {
            reversedString.append(ss[i]);
            if (i != 0) reversedString.append(" ");
        }

        return reversedString.toString();
    }
}
