import java.util.ArrayList;
import java.util.*;

public class Solution {
    
    public static boolean bfs(int src,int[] parent,boolean[] visited,ArrayList<ArrayList<Integer>> adj){

        parent[src]=-1;
        visited[src]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int ele=q.remove();
            for(int i=0;i<adj.get(ele).size();i++){
                if(visited[adj.get(ele).get(i)]==true && adj.get(ele).get(i)!=parent[ele]){
                    return true;
                }
                else if(!visited[adj.get(ele).get(i)]){
                    visited[adj.get(ele).get(i)]=true;
                    parent[adj.get(ele).get(i)]=ele;
                    q.add(adj.get(ele).get(i));
                }
            }
        }
        return false;
    }
    public static String cycleDetection(int[][] edges, int n, int m) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n+1];
        Arrays.fill(visited,false);
        int[] parent=new int[n+1];
        Arrays.fill(parent,-2);
        for(int i=1;i<n-1;i++){
            if(!visited[i]){
                boolean ans=bfs(i,parent,visited,adj);
                if(ans==true){
                    return "Yes";
                }
            }
        }
        return "No";
        
    }
    
}