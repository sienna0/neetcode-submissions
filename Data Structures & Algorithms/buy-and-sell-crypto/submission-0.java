class Solution {
    public int maxProfit(int[] prices) {
        int big = 0;
        int j = 0;
        while (j < prices.length) {
            j++;
            for (int i = 0; i < prices.length - j; i++) {
                if (prices[i + j] - prices[i] > big) big = 
                    prices[i + j] - prices[i];
            }
        }
        return big;
    }
}
