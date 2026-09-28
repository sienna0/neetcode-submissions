class Solution {
    public int maxProfit(int[] prices) {
        int currMin = prices[0];

        int diff = 0;

        for (int price : prices) {
            if (price - currMin > diff) diff = price - currMin;
            else if (price < currMin) currMin = price;
        }

        return diff;
    }
}
