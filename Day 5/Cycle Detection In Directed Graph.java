import java.util.*;
public class Solution {

  public static boolean solve(int index,ArrayList<ArrayList<Integer>> adj,boolean[]dfs,boolean[]visited){

    visited[index]=true;
    dfs[index]=true;
    for(int i=0;i<adj.get(index).size();i++){
      if(!visited[adj.get(index).get(i)]){
        boolean cycle=solve(adj.get(index).get(i),adj,dfs,visited);
        if(cycle==true){
          return true;
        }
      }
      else if(dfs[adj.get(index).get(i)]==true){
          return true;
      }
    }
    dfs[index]=false;
    return false;
  }
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
      ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
      for(int i=0;i<n+1;i++){
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<edges.size();i++){
        int u=edges.get(i).get(0);
        int v=edges.get(i).get(1);
        adj.get(u).add(v);
      }
      boolean[] visited=new boolean[n+1];
      boolean[] dfs=new boolean[n+1];
      Arrays.fill(visited,false);
      Arrays.fill(dfs,false);
      for(int i=1;i<n+1;i++){
        if(!visited[i]){
          boolean ans=solve(i,adj,dfs,visited);
          if(ans==true){
            return true;
          }
        }
      }
      return false;
  }
}