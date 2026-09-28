class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minnum = Integer.MAX_VALUE;
        for (int n : prices) {
            if (n < minnum) minnum = n;
            else if ((n - minnum) > profit) profit = (n - minnum);
        }
        return profit;
    }
}
