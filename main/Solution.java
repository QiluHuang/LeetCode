import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Node {
    int v;
    int cost;
    public Node(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }
}

public class Solution {
    // Complete the shortestReach function below.
    static int[] shortestReach(int n, int[][] edges, int s) {
        // construct returning datasture;
        int[] shortestPath = new int[n];
        for (int i = 0; i<n; i++) shortestPath[i] = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n];
        PriorityQueue<Node> queue = new PriorityQueue<>((n1, n2) -> {
            if (n1.cost<n2.cost) return -1;
            else if (n1.cost==n2.cost) return 0;
            else return 1;
        });
        List<List<Node>> adj = new ArrayList<>();
        for (int i = 0; i<n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i<edges.length; i++) {
            int f = edges[i][0]-1;
            int t = edges[i][1]-1;
            int cost = edges[i][2];
            adj.get(f).add(new Node(t, cost));
            adj.get(t).add(new Node(f, cost));
        }
        queue.offer(new Node(s-1, 0));
        int ex = 0;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (!visited[cur.v]) {
                if (cur.cost == 0) ex = cur.v;
                shortestPath[cur.v] = cur.cost;
                visited[cur.v] = true;
                List<Node> neighbors = adj.get(cur.v);
                for (int i = 0; i<neighbors.size(); i++) {
                    Node nei = neighbors.get(i);
                    if (cur.cost+nei.cost<shortestPath[nei.v]) {
                        shortestPath[nei.v] = cur.cost+nei.cost;
                        if (!visited[nei.v]&&queue.contains(nei)) {
                            queue.remove(nei);
                            queue.offer(new Node(nei.v, shortestPath[nei.v]));
                        } else if (!visited[nei.v]) {
                            queue.offer(new Node(nei.v, shortestPath[nei.v]));
                        }
                    }
                }
            }
        }
        for (int i = 0; i<n; i++) {
            if (!visited[i]) shortestPath[i] = -1;
        }
        int[] res = new int[n-1];
        for (int i = 0; i<n; i++) {
            if (i<ex) res[i]= shortestPath[i];
            else if(i>ex) res[i-1] = shortestPath[i];
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = shortestReach(n, edges, s);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
