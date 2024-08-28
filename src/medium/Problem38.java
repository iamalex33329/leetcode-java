package medium;

public class Problem38 {

    public String countAndSay(int n) {
        String[] s_arr = new String[n+1];
        s_arr[1] = "1";

        for (int i=2; i<=n; i++) { s_arr[i] = say(s_arr[i-1]); }

        return s_arr[n];
    }

    private String say(String s) {
        char ch=s.charAt(0);  int i=0;
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ch) {
                result.append(i).append(ch);
                ch = c; i = 1;
            }
            else { i++; }
        }
        result.append(i).append(ch);
        return result.toString();
    }
}
