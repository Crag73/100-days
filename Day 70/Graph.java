// package Graph;

import java.util.*;

/**
 * Graph
 */
public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> adj = new HashMap<>();

    public Graph() {
        adj = new HashMap<>();
    }

    public Graph(int v) {
        adj = new HashMap<>();
        for (int i = 0; i < v; i++) {
            adj.put(i, new HashMap<>());
        }
    }

    public void addVertex(int v) {
        adj.put(v, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int w) {
        adj.get(v1).put(v2, w);
        adj.get(v2).put(v1, w);
    }

    public boolean containsEdge(int v1, int v2) {
        return adj.get(v1).containsKey(v2);
    }

    public int getWeight(int v1, int v2) {
        return adj.get(v1).get(v2);
    }

    public void display() {
        for (int i : adj.keySet()) {
            System.out.println(i+" => "+ adj.get(i));
        }
    }
    public void removeEdge(int v1, int v2) {
        adj.get(v1).remove(v2);
        adj.get(v2).remove(v1);
    }

    public void removeVertex(int v) {
        for (int i : adj.get(v).keySet()) {
            adj.get(i).remove(v);
        }
    }

    public boolean hasPath(int v1, int v2) {
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(v1, v2, visited);
    }

    private boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int i : adj.get(src).keySet()) {
            if (!visited.contains(i)) {
                if (hasPath(i, des, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean bfs(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited.add(src);
        while (!q.isEmpty()) {
            int n = q.poll();
            if (n == des) {
                return true;
            }
            for (int i : adj.get(n).keySet()) {
                if (!visited.contains(i)) {
                    q.add(i);
                    visited.add(i);
                }
            }
        }
        return false;
    }

    public void bft() {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i : adj.keySet()) {
            if (!visited.contains(i)) {
                q.add(i);
                visited.add(i);
                while (!q.isEmpty()) {
                    int n = q.poll();
                    System.out.println(n);
                    for (int j : adj.get(n).keySet()) {
                        if (!visited.contains(j)) {
                            q.add(j);
                            visited.add(j);
                        }
                    }
                }
            }
        }
    }

    public void dft() {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        int c = 0;
        for (int i : adj.keySet()) {
            if (!visited.contains(i)){
                c++;
                st.add(i);
                visited.add(i);
                while (!st.isEmpty()){
                    int n = st.pop();
                    System.out.println(n);
                    for (int j : adj.get(n).keySet()) {
                        if (!visited.contains(j)) {
                            st.add(j);
                            visited.add(j);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addEdge(1, 3, 1);
        g.addEdge(1, 2, 1);
        g.addEdge(4, 2, 2);
        g.addEdge(4, 3, 3);
        g.addEdge(3, 5, 4);
        g.addEdge(5, 6, 3);
        g.addEdge(6, 7, 5);
        g.addEdge(5, 7, 5);
        // g.display();
        // g.dft();
        System.out.print(g.hasPath(5, 1));
    }
}