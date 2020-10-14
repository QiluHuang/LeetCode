package dStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        // corner case
        if (nums1.length == 0) return res;

        // go through nums2 to get next greater element of all nums
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums2.length; i++) {
            int curr = nums2[i];
            while(!stack.isEmpty() && curr >  stack.peek()) {
                int key = stack.pop();
                map.put(key, curr);
            }
            stack.push(curr);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // go through nums1 to generate our res
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
