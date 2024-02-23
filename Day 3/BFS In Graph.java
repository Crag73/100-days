import java.util.List;
import java.util.*;
public class Solution {

    public static void solve(int index,boolean visited[],List<Integer> ans,List<List<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        q.add(index);
        visited[index]=true;
        while(!q.isEmpty()){
            int cur=q.remove();
            ans.add(cur);
            for(int i=0;i<adj.get(cur).size();i++){
                if(visited[adj.get(cur).get(i)]==false){
                    visited[adj.get(cur).get(i)]=true;
                    q.add(adj.get(cur).get(i));
                }
            }
        }
    }
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        // Write your code here
        List<Integer> ans=new ArrayList<>();
        boolean visited[]=new boolean[n+1];   
        Arrays.fill(visited,false);
        solve(0,visited,ans,adj);
        return ans;
    }
}

