package medium;

public class Problem1405 {

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();

        int totalLength = a + b + c;
        int contA = 0, contB = 0, contC = 0;

        for (int i = 0; i < totalLength; i++) {
            if ((a >= b && a >= c && contA != 2) || (contB == 2 && a > 0) || (contC == 2 && a > 0))  {
                sb.append("a");
                a--;
                contA++;
                contB = 0;
                contC = 0;
            } else if ((b >= a && b >= c && contB != 2) || (contA == 2 && b > 0) || (contC == 2 && b > 0)) {
                sb.append("b");
                b--;
                contB++;
                contA = 0;
                contC = 0;
            } else if ((c >= a && c >= b && contC != 2) || (contB == 2 && c > 0) || (contA == 2 && c > 0)) {
                sb.append("c");
                c--;
                contC++;
                contA = 0;
                contB = 0;
            }
        }
        return sb.toString();
    }
}
