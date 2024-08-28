package easy;

public class Problem125 {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int l=0, r=s.length()-1;

        while (l < r) {
            /* 如果遇到非小寫字母或是數字，並且仍保持 l<r，就跳過 */
            while (!(('a' <= s.charAt(l) && s.charAt(l) <= 'z') || ('0' <= s.charAt(l) && s.charAt(l) <= '9')) && l<r) { l++; }
            while (!(('a' <= s.charAt(r) && s.charAt(r) <= 'z') || ('0' <= s.charAt(r) && s.charAt(r) <= '9')) && l<r) { r--; }

            if (s.charAt(l) == s.charAt(r)) { l++;  r--; }
            else { return false; }
        }

        return true;
    }
}
