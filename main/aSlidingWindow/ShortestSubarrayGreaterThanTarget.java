package aSlidingWindow;

/*
 ����һ������n���������������һ��������target��
 �ҳ��������У�������� >= target �ĳ�����С������������
 ��������ڷ��������������飬����0
 */
public class ShortestSubarrayGreaterThanTarget {

    public static int getShortestLen(int[] nums, int target) {
        int minLen = Integer.MAX_VALUE;
        boolean hasFound = false;
        int len = nums.length;

        int left = 0, right = 0;
        int sum = nums[right];
        while (left < len && right < len) {
            if (sum < target) {
                right++;
                if(right < len) sum += nums[right];
//                System.out.println("sum = " + sum + " left: " + left + " right: " + right);
            } else {
                hasFound = true;
                minLen = Math.min(right - left + 1, minLen);
//                System.out.println("sum = " + sum + " left: " + left + " right: " + right + " minLen: " + minLen);
                sum -= nums[left++];
            }
        }

        return hasFound ? minLen : 0;
    }
}
