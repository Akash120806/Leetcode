class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        if(prices.length==1)return profit ;
        for(int i = 0 ; i < prices.length ; i++){
            int cost = prices[i]-mini;
            profit = Math.max(profit,cost);
            mini = Math.min(mini , prices[i]);
        }
        return profit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna