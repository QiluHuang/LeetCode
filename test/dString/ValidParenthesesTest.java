package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {
    @Test
    public void generalTest() {
        String str = "[]";
        boolean res = ValidParentheses.isValid(str);
        System.out.println(res);
    }
}
