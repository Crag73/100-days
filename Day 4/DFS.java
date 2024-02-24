import java.util.*;

public class Solution {

    public static void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> cur) {
        cur.add(i);
        visited[i] = true;
        for (int j = 0; j < adj.get(i).size(); j++) {
            if (visited[adj.get(i).get(j)] != true) {
                dfs(adj.get(i).get(j), adj, visited, cur);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.size(); i++) {
            int j = edges.get(i).get(0);
            int k = edges.get(i).get(1);
            adj.get(j).add(k);
            adj.get(k).add(j);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[v + 1];
        Arrays.fill(visited, false);
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                ArrayList<Integer> cur = new ArrayList<>();
                dfs(i, adj, visited, cur);
                ans.add(cur);
            }
        }
        return ans;

    }
}