class Solution {
    public int solve(int[][]grid,int[][]dp,int n,int m){
        if(n==0 && m==0){
            return grid[0][0];
        }
        if(n<0 || m<0){
            return 10000000;
        }
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        int left = solve(grid,dp,n,m-1);
        int up = solve(grid,dp,n-1,m);
        dp[n][m]=grid[n][m]+Math.min(left,up);
        return dp[n][m];
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],0);
        }
        return solve(grid,dp,n-1,m-1);
    }
}