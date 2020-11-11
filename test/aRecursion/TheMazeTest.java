package aRecursion;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TheMazeTest {
    private static int[][] maze;
    @BeforeClass
    public static void setUp() {
        /*
        0 0 0 0 0
        0 0 0 0 0
        1 1 0 1 1
        0 0 0 0 0
         */
        maze = new int[4][5];

        for (int i = 0; i < maze[0].length; i++) {
            if (i != 2) maze[2][i] = 1;
        }

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void findPathTest() {
        int[] start = {0, 0};
        int[] end = {3, 4};
        int[][] map = new int[4][5];

        boolean res = TheMaze.findPath(maze, start, end, map);
        assertEquals(true, res);
    }
}
