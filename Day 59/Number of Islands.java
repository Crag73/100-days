class Solution {
    public void solve(char[][] grid,int i,int j,boolean[][]arr){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        arr[i][j]=true;
        solve(grid,i+1,j,arr);
        solve(grid,i-1,j,arr);
        solve(grid,i,j+1,arr);
        solve(grid,i,j-1,arr);
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] arr=new boolean[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],false);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && arr[i][j]==false){
                    solve(grid,i,j,arr);
                    ans++;
                }
            }
        }
        return ans;
        
    }
}