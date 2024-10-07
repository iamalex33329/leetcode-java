package easy;

public class Problem2696 {

    public int minLength(String s) {

        boolean check = true;

        while (check) {
            if (s.contains("AB")) {
                s = s.replace("AB", "");
            } else if (s.contains("CD")) {
                s = s.replace("CD", "");
            } else {
                check = false;
            }
        }

        return s.length();
    }

    public int minLength2(String s) {

        char[] stack = new char[s.length() + 1];
        int last = -1;

        for (char c : s.toCharArray()) {
            System.out.println(c + ":" + last);
            // 1. 當前字元是 'B' 且堆疊頂部是 'A'
            // 2. 當前字元是 'D' 且堆疊頂部是 'C'
            if (last > -1 && ((c == 'B' && stack[last] == 'A') || (c == 'D' && stack[last] == 'C'))) {
                last--;
            } else {
                stack[++last] = c;
            }
        }
        return last + 1;
    }
}
