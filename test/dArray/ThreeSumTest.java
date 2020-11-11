package dArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;


public class ThreeSumTest {
    @Test
    public void N3TimeConstantSpaceTest() {
        int[] nums = {-4, -3, -3, -3, -3, 1, 1, 1, 2, 2, 3, 3, 3, 6};
        List<List<Integer>> res = ThreeSum.N3TimeConstantSpace(nums, 0);
        for (List list : res) {
            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                int num = (int) itr.next();
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void N2TimeNSpaceTest() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = ThreeSum.N2TimeNSpace(nums, 0);
        for (List list : res) {
            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                int num = (int) itr.next();
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void N2TimeConstantSpaceTest() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = ThreeSum.N2TimeConstantSpace(nums, 0);
        for (List list : res) {
            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                int num = (int) itr.next();
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
