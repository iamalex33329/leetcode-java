package easy;

public class Problem1652 {

    public int[] decrypt(int[] code, int k) {
        int[] decryptCode = new int[code.length];

        if (k == 0) return decryptCode;

        int[] prefix = new int[code.length*2+1];

        for (int i=0; i<code.length*2; i++) {
            prefix[i+1] = prefix[i] + code[i % code.length];
        }

        for (int i=0; i<code.length; i++) {
            int end = i+k;
            if (k > 0) {
                decryptCode[i] = prefix[end+1] - prefix[i+1];
            } else {
                decryptCode[i] = prefix[i+code.length] - prefix[end+code.length];
            }
        }
        return decryptCode;
    }
}
