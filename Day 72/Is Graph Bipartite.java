class Solution {
    public boolean isBipartite(int[][] graph) {
        if(graph==null || graph.length==0)
            return true;
        int[] col=new int[graph.length];
        Arrays.fill(col,-1);
        for(int i=0;i<col.length;i++){
            if(col[i]==-1){
                if(bfs(i,col,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int cn,int[]col,int[][]arr){
        Queue<Integer> q=new LinkedList<>();
        q.add(cn);
        col[cn]=0;
        while(!q.isEmpty()){
            int n=q.poll();
            for(int i:arr[n]){
                if(col[i]==-1){
                    col[i]=1-col[n];
                    q.add(i);
                }
                else if(col[n]==col[i]){
                    return false;
                }
            }
        }
        return true;
    }
}