class Solution {
    public int bfs(int i,int j,int[][]visited,int[][]grid){
        visited[i][j]=1;
        int[][] dirs = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        Queue<int[]> q=new LinkedList<>();;
        q.add(new int[]{i,j});
        int temp=0;
        boolean isEnclave=true;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int m=cur[0];
            int n=cur[1];
            visited[m][n]=1;
            temp++;
            for (int[] dir:dirs) {
                int x = m+dir[0];
                int y = n + dir[1];
                if (x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1 && visited[x][y]==0) {
                    visited[x][y]=1;
                    q.add(new int[]{x, y});
                } else if (x<0 || x>= grid.length || y<0 || y>=grid[0].length) {
                   isEnclave=false;
                }
            }
        }
        return isEnclave ? temp:0;
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    ans+=bfs(i,j,visited,grid);
                }
            }
        }
        return ans;
    }
}