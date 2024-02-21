class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return check(grid,0,0,0,(grid.length*grid[0].length)-1);
    }
    public boolean check(int [][] grid,int r,int c,int count,int n){
        if(r<0 || c<0 || r>=grid.length || c>=grid.length){
            return false;
        }
        if(grid[r][c]!=count){
            return false;
        }
        if(count==n){
            return true;
        }
        int [] row={-2,-2,2,2,1,-1,-1,1};
        int [] col={1,-1,-1,1,-2,-2,2,2};
        for(int i=0;i<row.length;i++){
            boolean ans=check(grid,r+row[i],c+col[i],count+1,n);
            if(ans==true){
                return true;
            }
        }
        return false;
    }
}