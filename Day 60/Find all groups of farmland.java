import java.util.*;

class Solution {

    public void solve(int[][] land,int i,int j,int[] corner,List<int[]> ans,boolean [][]helper){
        if(i < 0 || i >= land.length || j < 0 || j >= land[0].length || helper[i][j]==true || land[i][j]==0){
            return;
        }
        helper[i][j]=true;
        if(corner[0]==-1 || corner[0] > i || corner[1] > j){
            corner[0]=i;
            corner[1]=j;
        }
        if(corner[2]==-1 || corner[2] < i || corner[3] < j){
            corner[2]=i;
            corner[3]=j;
        }
        solve(land,i+1,j,corner,ans,helper);
        solve(land,i,j+1,corner,ans,helper);
    }
    public int[][] findFarmland(int[][] land) {
        int n=land.length;
        int m=land[0].length;
        List<int[]> ans=new ArrayList<>();
        boolean [][]helper=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j]==1 && helper[i][j]==false){
                    int[] corner={-1,-1,-1,-1};
                    solve(land,i,j,corner,ans,helper);
                    ans.add(corner.clone());
                }
            }
        }
        return ans.toArray(new int[0][]);
    }
}
