//  Stock Buy and Sell – Max one Transaction Allowed
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int profit=0;
        int minPrices=prices[0];
        for(int i=1;i<prices.length;i++){
            int curPrices=prices[i];
            minPrices=Math.min(minPrices,curPrices);
            profit=Math.max(profit,curPrices-minPrices);
        }
        return profit;
    }
}
