import java.util.* ;
import java.io.*; 
public class Solution 
{
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
        int [] indegree=new int[v];
        for(int i=0;i<v;i++){
             ArrayList<Integer> temp = (ArrayList<Integer>)adj.get(i);
            for (int node : temp) 
            {
                indegree[node]++;
            }

        }
        Queue<Integer> que= new LinkedList<Integer>();
        for(int i = 0; i < v; i++) 
        {
            if(indegree[i] == 0) 
            {
               que.add(i);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!que.isEmpty()) 
        {
            int src = que.poll();
            ans.add(src);
        
            for(int node : adj.get(src)) 
            {
               indegree[node]--;
               if(indegree[node] == 0) 
                {
                   que.add(node);
                }
            }
        }
        
        return ans;
    }
}

