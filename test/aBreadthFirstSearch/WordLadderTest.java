package aBreadthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class WordLadderTest {
    @Test
    public void ladderLengthTest() {
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        int res = WordLadder.ladderLength("hit", "cog", wordList);
        assertEquals(5, res);
    }
}
