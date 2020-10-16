package dStack;

import java.util.Arrays;

public class StackUsingArray {
    private int[] nums;
    private int size = 0;

    public StackUsingArray() {
        nums = new int[10];
    }

    public StackUsingArray(int[] nums) {
        this.nums = nums;
    }

    public void push(int num) {
        if (size == nums.length) {
            throw new StackOverflowError();
        }

        nums[size++] = num;
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return nums[--size];
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(nums,0,size);
        return Arrays.toString(content);
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return nums[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
