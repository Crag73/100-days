import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void solve(int index,boolean[] visited,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        visited[index]=true;
        for(int i=0;i<adj.get(index).size();i++){
            if(!visited[adj.get(index).get(i)]){
                solve(adj.get(index).get(i),visited,ans,adj);
            }
        }
        ans.add(index);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            int j=edges.get(i).get(0);
            int k=edges.get(i).get(1);
            adj.get(j).add(k);
        }
        boolean [] visited=new boolean[v];
        Arrays.fill(visited,false);
        ArrayList<Integer> ans=new ArrayList<>(v);
        for(int i=0;i<v;i++){
            if(!visited[i]){
                solve(i,visited,ans,adj);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
