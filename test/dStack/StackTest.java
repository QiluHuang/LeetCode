package dStack;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void generalTest() {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        assertEquals(2, s.top());
        assertEquals(2,s.pop());
        assertEquals(false, s.empty());
    }
}
