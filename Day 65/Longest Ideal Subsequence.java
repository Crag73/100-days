class Solution {
    public int solve(String s,int k,int index,char prev,int [][] dp){
        if(index>=s.length()){
            return 0;
        }
        if(dp[index][prev]!=0){
            return dp[index][prev];
        }
        int pick=0;
        if(prev=='#' || Math.abs(prev-s.charAt(index))<=k){
            pick=1+solve(s,k,index+1,s.charAt(index),dp);
        }
        int notPick=solve(s,k,index+1,prev,dp);
        return dp[index][prev]=Math.max(pick,notPick);
    }
    public int longestIdealString(String s, int k) {
        int[][] dp=new int[s.length()+1][256];
        return solve(s,k,0,'#',dp);
    }
}