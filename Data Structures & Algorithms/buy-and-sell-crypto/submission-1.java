class Solution {
    public int maxProfit(int[] prices) {
        int maxP =0;
        int minB = prices[0];

        for(int i=0; i<prices.length;i++){
            int sell = prices[i];

            maxP = Math.max(maxP, sell - minB);
            minB = Math.min(minB, sell);
        }
        return maxP;
    }
}
