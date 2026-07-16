package Graph;

import java.util.ArrayList;

public class Graph1 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static void createGraph(int vertices) {
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    static void addEdge(int src, int dest) {
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    static void removeEdge(int src, int dest) {
        graph.get(src).remove(Integer.valueOf(dest));
        graph.get(dest).remove(Integer.valueOf(src));
    }

    static void printGraph() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbour : graph.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    static void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        createGraph(vertices);

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 3);
        addEdge(3, 4);

        printGraph();

        boolean[] visited = new boolean[vertices];

        System.out.print("\nDFS Traversal: ");
        dfs(0, visited);
    }
}