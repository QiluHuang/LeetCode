import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {




        // Complete the shortestReach function below.
        static int[] shortestReach(int n, int[][] edges, int s) {
            int[] res = new int[n - 1];

            // for (int i = 0; i < edges.length; i++) {
            //     for (int j = 0; j < edges[0].length; j++) {
            //         System.out.print(edges[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            int[][] graph = new int[n][n];
            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0] - 1;
                int b = edges[i][1] - 1;
                int weight = edges[i][2];
                graph[a][b] = weight;
                graph[b][a] = weight;
            }

            int i = 0;
            int endIdx = 1;
            while (endIdx <= n) {
                if (endIdx != s) {
                    res[i++] = dijkstra(n, s - 1, endIdx - 1, graph);
                }
                endIdx++;
            }

            return res;
        }

        private static int dijkstra(int n, int start, int end, int[][] graph) {
            PriorityQueue<Node> queue = new PriorityQueue<>(
                    new Comparator<Node>() {
                        @Override
                        public int compare(Node n1, Node n2) {
                            if (n1.cost<n2.cost) return -1;
                            else if (n1.cost==n2.cost) return 0;
                            else return 1;
                        }
                    }
            );
            queue.offer(new Node(start, 0));
            boolean[] visited = new boolean[n];

            while (!queue.isEmpty()) {
                Node currNode = queue.poll();
                int currNodeIdx = currNode.idx;
                if (currNode.idx == end) {
                    return currNode.cost;
                }
                if (visited[currNodeIdx] == false) {
                    visited[currNodeIdx] = true;
                    for (int i = 0; i < n; i++) {
                        if (graph[currNodeIdx][i] != 0 && visited[i] == false) {
                            int newCost = currNode.cost + graph[currNodeIdx][i];
                            queue.offer(new Node(i, newCost));
                        }
                    }
                }
            }
            return -1;
        }

        static class Node implements Comparator<Node> {
            int idx;
            int cost;

            public Node(int idx, int cost) {
                this.idx = idx;
                this.cost = cost;
            }

            @Override
            public int compare(Node node1, Node node2){
                return node1.cost-node2.cost;
            }
        }

//    static class MinHeap {
//        private NodeInfo[] minHeap;
//        private int size;
//        private int maxSize;
//
//        private static final int FRONT = 1;
//
//        public MinHeap(int maxSize) {
//            this.maxSize = maxSize;
//            this.size = 0;
//            minHeap = new NodeInfo[this.maxSize + 1];
//            minHeap[0] = new NodeInfo(Integer.MIN_VALUE, Integer.MIN_VALUE);
//        }
//
//        // Function to return the parent node index / left child node index / right child node index
//        private int parent(int currIdx) {
//            return currIdx / 2;
//        }
//
//        private int leftChild(int currIdx) {
//            return 2 * currIdx;
//        }
//
//        private int rightChild(int currIdx) {
//            return (2 * currIdx) + 1;
//        }
//
//        private boolean isLeaf(int currIdx) {
//            System.out.println("currIdx: " + currIdx + " size: " + size);
//            if (currIdx >= (size / 2) && currIdx <=  size) {
//                return true;
//            }
//            return false;
//        }
//
//        // Function to swap two nodes of the heap
//        private void swap(int idx1, int idx2) {
//            NodeInfo temp;
//            temp = minHeap[idx1];
//            minHeap[idx1] = minHeap[idx2];
//            minHeap[idx2] = temp;
//        }
//
//        // Function to insert a node into the heap
//        public void insert(NodeInfo node) {
//            if (size >= maxSize) return;
//
//            minHeap[++size] = node;
//            int currIdx = size;
//            System.out.println("insert size: " + size);
//
//            while (minHeap[currIdx].leastCost < minHeap[parent(currIdx)].leastCost) {
//                swap(currIdx, parent(currIdx));
//                currIdx = parent(currIdx);
//            }
//        }
//
//        // Function to remove and return the minimum element from the heap;
//        public NodeInfo remove() {
//            NodeInfo popped = minHeap[FRONT];
//            minHeap[FRONT] = minHeap[size--];
//            minHeapify(FRONT);
//            return popped;
//        }
//
//        public boolean isEmpty() {
//            if (size == 0) return true;
//            return false;
//        }
//
//        private void minHeapify(int idx) {
//            System.out.println(isLeaf(idx));
//            if (!isLeaf(idx)) {
//                if (minHeap[idx].leastCost > minHeap[leftChild(idx)].leastCost ||
//                        minHeap[idx].leastCost > minHeap[rightChild(idx)].leastCost) {
//                    if (minHeap[leftChild(idx)].leastCost < minHeap[rightChild(idx)].leastCost) {
//                        swap(idx, leftChild(idx));
//                        minHeapify(leftChild(idx));
//                    } else {
//                        swap(idx, rightChild(idx));
//                        minHeapify(rightChild(idx));
//                    }
//                }
//            }
//        }
//    }



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            int[][] edges = new int[4][3];
            edges[0][0] = 1;
            edges[0][1] = 2;
            edges[0][2] = 24;

            edges[1][0] = 1;
            edges[1][1] = 4;
            edges[1][2] = 20;

            edges[2][0] = 3;
            edges[2][1] = 1;
            edges[2][2] = 3;

            edges[3][0] = 4;
            edges[3][1] = 3;
            edges[3][2] = 12;

            int[] res = shortestReach(4, edges, 1);
            for (int num : res) {
                System.out.println(num);
            }
        }


}
