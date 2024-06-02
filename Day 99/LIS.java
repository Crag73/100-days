class Solution {
    public int solve(int[] arr,int index,int prev,int [][] dp){
        if(index==arr.length){
            return 0;
        }
        if(dp[index][prev+1]!=-1){
            return dp[index][prev+1];
        }
        int len=solve(arr,index+1,prev,dp);
        if(prev==-1 || arr[index]>arr[prev]){
            len=Math.max(len,1+solve(arr,index+1,index,dp));
        }
        return dp[index][prev+1]=len;
    }
    public int lengthOfLIS(int[] arr) {
        int[][] dp=new int[arr.length+1][arr.length+1];
        for(int i=0;i<arr.length+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(arr,0,-1,dp);
    }
}