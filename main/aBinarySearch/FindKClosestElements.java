package aBinarySearch;

import java.util.LinkedList;
import java.util.List;

public class FindKClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new LinkedList<>();

        int left = 0, right = arr.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid - 1] < x && x <= arr[mid]) {
                res = generateList(arr, k, x, mid - 1, mid);
                break;
            } else if (arr[mid] < x && x < arr[mid + 1] ) {
                res = generateList(arr, k, x, mid, mid + 1);
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else if (x < arr[mid]) {
                right = mid - 1;
            }
        }

        return res;
    }

    private static List<Integer> generateList(int[] arr, int k, int x, int leftXIdx, int rightXIdx) {
        LinkedList<Integer> list = new LinkedList<>();

        int count = k;

        while (count > 0) {
            if (Math.abs(arr[leftXIdx] - x) < Math.abs(arr[rightXIdx] - x)) {
                list.addFirst(arr[leftXIdx--]);
                count--;
            } else if (Math.abs(arr[leftXIdx] - x) > Math.abs(arr[rightXIdx] - x)) {
                list.addLast(arr[rightXIdx++]);
                count--;
            } else {
                list.addFirst(arr[leftXIdx--]);
                count--;
            }
        }

        return list;
    }
}
