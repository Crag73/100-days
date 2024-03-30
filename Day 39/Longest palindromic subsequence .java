class Solution {
    public int solve(char[] arr,int i,int j,int [][]dp){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==j){
            return 1;
        }
        if(arr[i]==arr[j] && i+1==j){
            return 2;
        }
        if(arr[i]==arr[j]){
            return solve(arr,i+1,j-1,dp)+2;
        }
        return dp[i][j]=Math.max(solve(arr,i+1,j,dp),solve(arr,i,j-1,dp));
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int [][]dp=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        int result=solve(s.toCharArray(),0,n-1,dp);
        return result;
    }
}