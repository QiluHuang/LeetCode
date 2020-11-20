package aDepthFirstSearch;

import edu.princeton.cs.algs4.Graph;

import java.util.Stack;

public class DepthFirstSearch {
    public void DepthFirstSearchRecursively() {

    }

    public void depthFirstSearchIteratively(Graph graph, int v) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[graph.V()];
        stack.push(v);
        visited[v] = true;
        while (!stack.isEmpty()) {
            int currVertex = stack.pop();
            for (int nextVertex : graph.adj(v)) {
                if (!visited[nextVertex]) {
                    stack.push(nextVertex);
                    visited[nextVertex] = true;
                }
            }
        }
    }
}
