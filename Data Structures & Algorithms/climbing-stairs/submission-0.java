class Solution {
    private int helper(int n,int ways[]){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]=helper(n-1,ways)+helper(n-2,ways);
        return ways[n];
    }
    public int climbStairs(int n) {
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        return helper(n,ways);
    }
}