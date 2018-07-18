package leetcode;

/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ */

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i <prices.length; i++){
            // 항상 뒤에 것이 앞에 것 보다 크도록 하는 연산.
            if(prices[i] < min) min = prices[i];
                // 뒤가 앞에것보다 크면 그제서야 연산.
            else if(prices[i] - min > max) max = prices[i] - min;
        }
        return max;
    }
}
