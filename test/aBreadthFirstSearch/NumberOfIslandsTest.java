package aBreadthFirstSearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    @Test
    public void numOfIslandsTest1() {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        int res = NumberOfIslands.numIslands(grid);
        assertEquals(1, res);
    }

    @Test
    public void numOfIslandsTest2() {
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int res = NumberOfIslands.numIslands(grid);
        assertEquals(3, res);
    }
}