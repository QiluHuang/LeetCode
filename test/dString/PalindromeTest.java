package dString;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PalindromeTest {
    @BeforeClass
    public static void setUp() {

    }

    @Test
    public void isPalindromeTest() {
        String s = "A man, a plan, a canal: Panama";

        assertEquals(true, Palindrome.isPalindrome(s));
    }

}
