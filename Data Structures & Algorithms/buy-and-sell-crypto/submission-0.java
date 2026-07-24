class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxpro = 0;
        for(int i = 0; i<n;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            maxpro = Math.max(maxpro, prices[i] - min);
        }
        return maxpro;
    }
}
