package medium;

public class Problem1894 {

    public int chalkReplacer(int[] chalk, int k) {

        int index = 0;
        while (k >= chalk[index]) {
            k -= chalk[index++];
            if (index == chalk.length) index = 0;
        }
        return index;
    }

    public int chalkReplacer2(int[] chalk, int k) {

        int totalChalk = 0;
        for (int c : chalk) totalChalk += c;

        k %= totalChalk;

        for (int i=0; i<chalk.length; i++) {
            if (k < chalk[i]) return i;
            k -= chalk[i];
        }

        return 0;
    }
}