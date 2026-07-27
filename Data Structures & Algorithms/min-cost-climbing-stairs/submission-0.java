class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        int min = Math.min(fun(0,cost,dp),fun(1,cost,dp));
        return min;
    }
    public int fun(int ind , int[]cost,int[] dp){
        if(ind >= cost.length){
            return 0;
        }
        if(dp[ind] != -1) return dp[ind];
        int mincost =Math.min(cost[ind] + fun(ind+1,cost,dp), cost[ind]+fun(ind +2,cost,dp));
        return dp[ind] = mincost;
    }
}
