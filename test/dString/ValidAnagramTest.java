package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {
    // 242. Valid Anagram
    @Test
    public void isAnagramTest() {
        boolean res = ValidAnagram.isAnagram("anagram", "nagaram");
        assertEquals(true, res);
    }
 }
