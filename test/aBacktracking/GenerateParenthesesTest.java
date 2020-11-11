package aBacktracking;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;


public class GenerateParenthesesTest {
    @Test
    public void generateParenthesisTest() {
        List<String> res = GenerateParentheses.generateParenthesis(3);
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), res);
    }
}
