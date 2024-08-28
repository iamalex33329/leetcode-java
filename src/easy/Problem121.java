package easy;

public class Problem121 {

    public int maxProfit(int[] prices) {
        int profit=0, i=0, j=1;

        while (i < prices.length && j < prices.length) {
            int tmpProfit = prices[j] - prices[i];
            if (tmpProfit < 0) { i = j; }
            else { profit = tmpProfit > profit ? tmpProfit : profit; }
            j++;
        }
        return profit;
    }
}
