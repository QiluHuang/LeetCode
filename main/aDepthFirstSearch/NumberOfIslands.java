package aDepthFirstSearch;

public class NumberOfIslands {
    /**
     * 200. Number of Islands
     * */
    public static int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                System.out.print(visited[i][j] + "  ");
            }
            System.out.println();
        }

        return count;
    }

    private static void dfs(char[][] grid, int[][] visited, int x, int y) {
        if (y >= grid.length - 1 || y < 0 || x >= grid.length - 1 || x < 0 || visited[x][y] == 1) return;

        visited[x][y] = 1;
        // right - down - left - up
        dfs(grid, visited, x, y + 1);
        dfs(grid, visited, x + 1, y);
        dfs(grid, visited, x, y - 1);
        dfs(grid, visited, x - 1, y);
    }
}
