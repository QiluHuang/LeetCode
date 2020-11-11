package aBreadthFirstSearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpenTheLockTest {
    @Test
    public void openLockTest() {
        String[] deadEnds = {"0201","0101","0102","1212","2002"};
        int res = OpenTheLock.openLock(deadEnds, "0202");
        assertEquals(6, res);
    }

    @Test
    public void openLockTest2() {
        String[] deadEnds = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        int res = OpenTheLock.openLock(deadEnds, "8888");
        assertEquals(8, res);
    }

    @Test
    public void openLockTest3() {
        String[] deadEnds = {"0000"};
        int res = OpenTheLock.openLock(deadEnds, "8888");
        assertEquals(-1, res);
    }


    @Test
    public void openLockSmallRange() {
        String[] deadEnds = {"87","89","78","98"};
        int res = OpenTheLock.openLock(deadEnds, "88");
        assertEquals(-1, res);
    }
}