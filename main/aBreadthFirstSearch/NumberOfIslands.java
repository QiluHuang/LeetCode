package aBreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;


public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void bfs(char[][] grid, int row, int col) {
        int rowLen = grid.length;
        int colLen = grid[0].length;

        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        grid[row][col] = '0';


        while (!queue.isEmpty()) {
            int[] currNode = queue.poll();
            int currRow = currNode[0];
            int currCol = currNode[1];


            for (int[] dir : directions) {
                int nextRow = currRow + dir[0];
                int nextCol = currCol + dir[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= rowLen || nextCol >= colLen) {
                    continue;
                }
                if (grid[nextRow][nextCol] == '1') {
                    grid[nextRow][nextCol] = '0';
                    queue.offer(new int[]{nextRow, nextCol});
                }
            }
        }
    }
}


