package aBreadthFirstSearch;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 286. Walls and Gates
 * */
public class WallsAndGates {
    public static void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms == null) return;

        int rowLen = rooms.length;
        int colLen = rooms[0].length;
        int empty = Integer.MAX_VALUE;

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (rooms[i][j] == empty) rooms[i][j] = bfs(rooms, i, j, rowLen, colLen);
            }
        }
    }

    private static int bfs(int[][] rooms, int row, int col, int rowLen, int colLen) {
        Queue<Node> queue = new ArrayDeque();
        int[][] visited = new int[rowLen][colLen];   // 0: unvisited  1: visited
        int[][] distance = new int[rowLen][colLen];

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up

        // initialize
        Node root = new Node(row, col);
        queue.offer(root);
        visited[row][col] = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            Node currNode = queue.poll();
            int currRow = currNode.row;
            int currCol = currNode.col;


            for (int[] dir : directions) {
                int nextRow = currRow + dir[0];
                int nextCol = currCol + dir[1];
                if (0 > nextRow || nextRow >= rowLen ||
                        0 > nextCol || nextCol >= colLen) {
                    continue;
                }


                if (rooms[nextRow][nextCol] != -1 && visited[nextRow][nextCol] != 1) {
                    distance[nextRow][nextCol] = distance[currRow][currCol] + 1;
                    if (rooms[nextRow][nextCol] == 0) {
                        return distance[nextRow][nextCol];
                    }

                    queue.add(new Node(nextRow, nextCol));
                    visited[nextRow][nextCol] = 1;
                }
            }

        }

        return rooms[col][row];
    }
}

class Node {
    int row;
    int col;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
