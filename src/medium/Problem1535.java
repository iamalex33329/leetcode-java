package medium;

public class Problem1535 {

    public int getWinner(int[] arr, int k) {
        int winner = arr[0], winRound = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > winner) {
                winner = arr[i];
                winRound = 1;
            }
            if (winRound++ == k) break;
        }
        return winner;
    }
}
