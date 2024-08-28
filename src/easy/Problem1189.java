package easy;

public class Problem1189 {

    public int maxNumberOfBalloons(String text) {

        int b=0, a=0, l=0, o=0, n=0;

        for (char ch : text.toCharArray()) {
            switch (ch) {
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        int minCount = Integer.MAX_VALUE;
        minCount = Math.min(minCount, b);
        minCount = Math.min(minCount, a);
        minCount = Math.min(minCount, l / 2);
        minCount = Math.min(minCount, o / 2);
        minCount = Math.min(minCount, n);

        return minCount;
    }
}
