class Solution {
    private int helper(int[] nums, int[] dp,int i){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        else{
            if(i==0) return dp[i]=nums[0];
            int ans1= nums[i]+helper(nums,dp,i-2);
            int ans2= helper(nums,dp,i-1);
            dp[i]=Math.max(ans1,ans2);
        }
        return dp[i];
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,dp,n-1);
    }
}
