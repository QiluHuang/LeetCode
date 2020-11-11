package aBreadthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SlidingPuzzlesTest {
    @Test
    public void slidingPuzzleTest() {
//        int[][] board = {{4,1,2},{5,0,3}};
//        int[][] board = {{1,2,3},{4,5,0}};
        int[][] board = {{1,0,2},{3,4,5},{6,7,8}};
        int res = SlidingPuzzles.slidingPuzzle(board);
        assertEquals(1, res);
    }
}
