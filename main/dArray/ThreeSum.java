package dArray;

import java.util.*;

public class ThreeSum {
    // method 1
    public static List<List<Integer>> N3TimeConstantSpace(int[] nums, int n) {
        //WRITE CODE
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    if (nums[i] + nums[j] + nums[k] == n) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        list.add(subList);
                    }
                }
            }
        }

        return list;
    }

    // method 2
    public static List<List<Integer>> N2TimeNSpace(int[] nums, int n) {
        //WRITE CODE
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int remain = n - nums[i] - nums[j];
                if (map.containsKey(remain)) {
                    int index = map.get(remain);
                    if (index != i && index != j) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(remain);
                        list.add(subList);
                    }
                }
            }
        }

        return list;
    }

    // method 3
    public static List<List<Integer>> N2TimeConstantSpace(int[] nums, int n) {
        //WRITE CODE
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int remainder = n - nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right && nums[left] <= remainder && remainder <= nums[right]) {
                int sum = nums[left] + nums[right];
                if (sum == remainder) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    list.add(subList);
                    break;
                } else if (sum > n) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return list;
    }
}
