package easy;

public class Problem9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String strX = String.valueOf(x);
        int l = 0, r = strX.length()-1;

        while (l < r) {
            if (strX.charAt(l++) != strX.charAt(r--)) return false;
        }

        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) return false;

        int reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }
}
