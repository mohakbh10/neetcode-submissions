class Solution {
    private int helper(int[] cost, int dp[],int idx){
        int amt=0;
        if(dp[idx]!=-1){
            return dp[idx];
        }
        else{
            if(idx>=cost.length) return dp[idx]=0;
            amt = cost[idx]+Math.min(helper(cost,dp,idx+1),helper(cost,dp,idx+2));
        }
        return dp[idx]=amt;
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int dp[]=new int[n+2];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost, dp, 0), helper(cost, dp, 1));
    }
}
