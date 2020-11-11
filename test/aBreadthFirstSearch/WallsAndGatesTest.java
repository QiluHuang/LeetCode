package aBreadthFirstSearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class WallsAndGatesTest {
    @Test
    public void wallsAndGatesTest() {
        int[][] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        int[][] expect = {{3,-1,0,1},{2,2,1,-1},{1,-1,2,-1},{0,-1,3,4}};

        WallsAndGates.wallsAndGates(rooms);
        assertArrayEquals(expect, rooms);


    }
}