package dArray;

public class ArrayUtil {
    // ���������ֵ
    public int maxValue(int[] nums) {
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, nums[i]);
        }
        return maxValue;
    }


    // ��������Сֵ
    public int minValue(int[] nums) {
        int minValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            minValue = Math.min(minValue, nums[i]);
        }
        return minValue;
    }


    // ��������ܺ�
    public int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }


    // �������ƽ��ֵ
    public int getAvg(int[] nums) {
        return getSum(nums) / nums.length;
    }


    // ��ת����
    public void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right++] = temp;
        }
    }


    // ��������
    public int[] copyArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        return res;
    }


    // ��������



    // ��������
    public void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    // ����ָ��Ԫ��
    public int getIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return -1;
    }
}
