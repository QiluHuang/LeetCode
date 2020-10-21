package aRecursion;

public class TheMaze {
    // ÉÐ¹è¹ÈµÝ¹é
    public static boolean findPath(int[][] maze, int[] start, int[] end, int[][] checkMap) {
        int startX = start[0];
        int startY = start[1];

        // 2 can go through, 3 cannot go through

        // check the destination == 2
        if (checkMap[end[0]][end[1]] == 2) {
            return true;
        }

        // check the wall
        if (maze[startX][startY] == 0 && checkMap[startX][startY] != 2 && checkMap[startX][startY] != 3) {
            checkMap[startX][startY] = 2;
            if (startY < maze[0].length - 1 && findPath(maze, new int[]{startX, startY + 1}, end, checkMap)) return true; //right
            else if (startX < maze.length - 1 && findPath(maze, new int[]{startX + 1, startY}, end, checkMap)) return true; //down
            else if (startY >= 0 && findPath(maze, new int[]{startX, startY - 1}, end, checkMap)) return true; //left
            else if (startY >= 0 && findPath(maze, new int[]{startX - 1, startY}, end, checkMap)) return true; //up
            else {
                checkMap[startX][startY] = 3;
                return false;
            }
        }

        else if (maze[startX][startY] == 1 || checkMap[startX][startY] == 3) {
            return false;
        }

        return false;
    }
}
