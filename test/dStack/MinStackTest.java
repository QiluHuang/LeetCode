package dStack;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinStackTest {
    @Test
    public void generalTest() {
        MinStack stack = new MinStack();

        stack.push(-3); // -3
        stack.push(2);  // -3
        stack.push(8);  // -3
        stack.push(-2); // -3
        stack.push(0);  // -3
        stack.pop();
        stack.push(-8);  // -8


        assertEquals(-8, stack.getMin());
    }
}
