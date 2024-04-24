import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans=new ArrayList<>();
        if(n==0){
            return ans;
        }
        if(n==1){
            ans.add(0);
            return ans;
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] degree=new int[n];
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            degree[u]++;
            degree[v]++;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                q.add(i);
            }
        }
        while(n>2){
            int size=q.size();
            n-=size;
            for(int i=0;i<size;i++){
                int node=q.poll();
                for(int neighbor:adj.get(node)){
                    if(--degree[neighbor]==1){
                        q.add(neighbor);
                    }
                }
            }
        }
        ans.addAll(q);
        return ans;
    }
}
