package dStack;

public class StackUsingArrayTest {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(20);
        System.out.println(stack); // [10, 20]

        stack.push(30);
        System.out.println(stack.peek()); // 30

        stack.push(40);
        stack.pop();
        System.out.println(stack.peek()); // 30

        System.out.println(stack.isEmpty()); // false
    }
}
