package easy;

public class Problem3274 {

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        int n1 = coordinate1.charAt(0) - 96 + Integer.parseInt(String.valueOf(coordinate1.charAt(1)));
        int n2 = coordinate2.charAt(0) - 96 + Integer.parseInt(String.valueOf(coordinate2.charAt(1)));

        return n1 % 2 == n2 % 2;
    }
}
