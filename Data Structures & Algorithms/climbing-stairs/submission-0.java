class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int count  = func(0,n, dp);
        return count;
    }
    public int func(int  steps , int n, int[] dp){
        if(steps>n) return 0;
        if(steps == n){
            return 1;
        }
        if(dp[steps] != -1)
            return dp[steps];
        int count =  func(steps+1,n,dp) + func(steps+2,n,dp);
        return dp[steps] = count;
    }
}
