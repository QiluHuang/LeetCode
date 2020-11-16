package dArray;


public class DynamicArray {
    private int[] arr;
    private int currLen = 0;  // keep track of the number of items in this array

    public DynamicArray(int length) {
        arr = new int[length];
    }

    /** add */
    public void insert(int num) {
        // 1. If the array is full, resize it
        resizeIfRequired();

        // 2. Add the new item at the end
        arr[currLen++] = num;
    }

    private void resizeIfRequired() {
        if (currLen == arr.length) {
            // 1. Create a new array (twice the size)
            int[] newArr = new int[currLen * 2];

            // 2. Copy all the exiting items
            for (int i = 0; i < currLen; i++) {
                newArr[i] = arr[i];
            }

            // 3. Set "items" to this new array
            arr = newArr;
        }
    }

    /** delete */
    public void removeAt(int idx) {
        // 1. Validate the index
        if (idx < 0 || idx >= currLen) {
            throw new IllegalArgumentException();
        }

        // 2. Shift the items to the left to fill the hole
        for (int i = idx; i < currLen - 1; i++) {
            arr[i] = arr[i + 1];
        }

        currLen--;
    }

    /**
     * search
     * Time: O(n) */
    public int indexOf(int num) {
        // 1. If we find it, return index
        for (int i = 0; i < currLen; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        // 2. Otherwise, return -1
        return -1;
    }

    /** print */
    public void print() {
        for (int i = 0; i < currLen; i++) {
            System.out.println(arr[i]);
        }
    }


    /**
     * return the largest number
     * Time: O(n)
     * */
    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    /** return the common items in this array and another array */
    public DynamicArray getIntersection(DynamicArray anotherArr) {
        DynamicArray intersection = new DynamicArray(currLen);

        for (int num : arr) {
            if (anotherArr.indexOf(num) >= 0) {
                intersection.insert(num);
            }
        }

        return intersection;
    }

    /** reverse the array */
    public void reverse() {
        int[] newArr = new int[currLen];

        for (int i = 0; i < currLen; i++) {
            newArr[i] = arr[currLen - i - 1];
        }

        arr = newArr;
    }

    /** insert an item at a given index */
    public void insertAt(int item, int index) {
        if (index < 0 || index > currLen) {
            throw new IllegalArgumentException();
        }

        resizeIfRequired();

        for (int i = currLen - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = item;
        currLen++;
    }
}
