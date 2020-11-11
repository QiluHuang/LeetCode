package aDepthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {
    @Test
    public void numIslandsTest() {
        char[][] input = new char[4][5];

        input[0][0] = '1';
        input[0][1] = '1';
        input[1][0] = '1';
        input[1][1] = '1';
        input[2][2] = '1';
        input[3][3] = '1';
        input[3][4] = '1';

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + "  ");
            }
            System.out.println();
        }

        int res = NumberOfIslands.numIslands(input);
        assertEquals(3, res);
    }
}
