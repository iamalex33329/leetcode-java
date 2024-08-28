package easy;

public class Problem2073 {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;

        for (int i=0; i<tickets.length*100; i++) {
            if (tickets[i%tickets.length] != 0) {
                tickets[i%tickets.length]--;
                result++;

                if (tickets[k] == 0) return result;
            }
        }

        return 0;
    }

    public int timeRequiredToBuy1(int[] tickets, int k) {
        int targetTickets = tickets[k];
        int totalTime = 0;

        for (int i=0; i<tickets.length; i++) {
            if (tickets[i] < targetTickets) totalTime += tickets[i];
            else totalTime += (k >= i) ? targetTickets : targetTickets - 1;
        }
        return totalTime;
    }
}
