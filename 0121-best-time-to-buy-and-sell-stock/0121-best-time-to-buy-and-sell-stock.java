class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int  j = 1,k=0;
        int profit = 0;
        int less = prices[0],val=0;
        while (j < n) {
            if (prices[j] < less) {
                less = prices[j]; 
            }
            k=j;
            while (k<n && prices[k] > less) {
                val = Math.abs(prices[k] - less);   
                         profit = Math.max(profit,val);
                k++;
            }
   
            j++;
            
        }
        return profit;
    }
}