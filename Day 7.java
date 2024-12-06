class Solution {
    public int maximumProfit(int prices[]) {
        // code here
      // buy and sell on next day if next day prices is greater
       int profit=0;
       for(int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
               int curProfit=prices[i]-prices[i-1];
               profit+=curProfit;
           }
       }
       return profit;
    }
}
