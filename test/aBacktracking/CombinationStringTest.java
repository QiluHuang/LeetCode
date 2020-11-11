package aBacktracking;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationStringTest {
    /**
     * 17. Letter Combinations of a Phone Number
     **/
    @Test
    public void letterCombinationsTest() {
        List<String> res = CombinationString.letterCombinations("23");

        assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), res);
    }
}
