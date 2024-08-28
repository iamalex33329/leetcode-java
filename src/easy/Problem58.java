package easy;

public class Problem58 {

    public static int lengthOfLastWord(String s) {
        String[] ss = s.strip().split(" ");
        return ss[ss.length-1].length();
    }

    public static int lengthOfLastWord1(String s) {
        for (int i=s.length()-1; i>=0; i--) {
            // 跳過直到字元不是空格
            if(s.charAt(i) == ' ') continue;

            // 開始數最後一個單字的長度
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--;
            return i - j;
        }

        return 0;
    }
}
