package Graph;

//Graph:
//Adjacency List: 
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph1 {

    static ArrayList<ArrayList<Integer>> graph;

    static void createGraph(int v) {
        graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    static void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    static void removeEdge(int src, int dest) {
        graph.get(src).remove(graph.get(src).indexOf(dest));
        graph.get(dest).remove(graph.get(dest).indexOf(src));
    }

    static void dfs(int src, boolean[] visited) {
        visited[src] = true;
        System.out.print(src + " ");

        for (int neighbour : graph.get(src)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }

    }

    static void bfs(int src, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        visited[src] = true;
        queue.offer(src);

        while (!queue.isEmpty()) {

            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }

    }

    // static boolean isCyclic(int src,int parent,boolean[] visited)
    // {
    // visited[src]=true;
    // for(int neighbour : graph.get(src))
    // {
    // if(visited[neighbour, src,visited])
    // {
    // isCyclic(neighbour, src, visited)
    // }
    // else if(neighbour!= parent)
    // {

    // }

    // }

    // }

    static int countComponents() {
        int count = 0;
        boolean[] visited = new boolean[graph.size()];
        for (int i = 1; i < graph.size(); i++) {
            if (!visited[i]) {
                dfs(i, visited);
            }
            count++;

        }
        return count;
    }

    static void topologicalSort(int src)
    {
        for(int i;i<)
    }

    static void topodfs(int src, boolean[] visited, Deque<Integer> st) {
        visited[src] = true;
        for (int neighbour : graph.get(src)) {
            if (!visited[neighbour]) {
                topodfs(neighbour, visited, st);
            }
        }
        st.push(src);

    }

    public static void main(String[] args) {

        int v = 6;
        createGraph(v);
        addEdge(1, 2);
        addEdge(1, 6);
        addEdge(2, 3);
        addEdge(2, 5);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 6);

        // dfs(1, new boolean[v + 1]);
        countComponents();
        topodfs(v, visited, st);

    }
}
