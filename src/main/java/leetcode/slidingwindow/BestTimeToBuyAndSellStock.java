package leetcode.slidingwindow;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = Integer.MAX_VALUE;

        //
        for (int i = 0; i < prices.length; i++) {
            int val = prices[i];
            if (minVal > val) {
                minVal = val;
            } else if (maxProfit < val - minVal) {
                maxProfit = val - minVal;
            }
        }

        return maxProfit;
    }

}
