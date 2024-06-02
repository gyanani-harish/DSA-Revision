import java.util.*;

public class GraphBFS {

    public static List<Integer> bfs(int startNode, List<List<Integer>> adjList) {
        int numNodes = adjList.size();
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[numNodes];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        adjList.add(Arrays.asList(1, 2));   // Neighbors of node 0
        adjList.add(Arrays.asList(0, 3));   // Neighbors of node 1
        adjList.add(Arrays.asList(0, 3));   // Neighbors of node 2
        adjList.add(Arrays.asList(1, 2));   // Neighbors of node 3

        List<Integer> bfsTraversal = bfs(0, adjList);
        System.out.println("BFS Traversal from node 0: " + bfsTraversal); 
    }
}
