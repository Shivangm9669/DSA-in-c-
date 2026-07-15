class Solution {
    public int maxProfit(int[] prices) {
        int maxCost =0;
        int purchased =prices[0];
        int n = prices.length;

        for(int i=1 ; i<n ; i++){
            if(prices[i] < purchased){
                purchased = prices[i];
                continue;
            }

            maxCost = Math.max(maxCost ,  prices[i] - purchased);
        }

        return maxCost;
    }
}