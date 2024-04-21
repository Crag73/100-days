class Solution {
    public boolean solve(int cur,int destination,List<List<Integer>> adj,boolean[] visited){
        if(cur==destination){
            return true;
        }
        if(visited[cur]==true){
            return false;
        }
        visited[cur]=true;
        for(int i=0;i<(adj.get(cur)).size();i++){
            if(solve(adj.get(cur).get(i),destination,adj,visited)){
                return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean [] visited=new boolean[n+1];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return solve(source,destination,adj,visited);

    }
}