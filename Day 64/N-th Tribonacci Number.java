class Solution {
    public int solve(int n,int[] dp){
        if(dp[n]!=0){
            return dp[n];
        }
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return dp[n]=(solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp));
    }
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        return solve(n,dp);
    }
}