package dStack;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {
    @Test
    public void isValidTest() {
        String str = "{{])";
        boolean res = ValidParentheses.isValid(str);
        assertEquals(false, res);
    }
}
