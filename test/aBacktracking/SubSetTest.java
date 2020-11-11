package aBacktracking;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class SubSetTest {
    @Test
    public void subSetsTest() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = SubSet.subsets(nums);

        Iterator<List<Integer>> itr = list.iterator();
        while (itr.hasNext()) {
            List<Integer> res = itr.next();
            Iterator<Integer> itr2 = res.iterator();
            while(itr2.hasNext()) {
                Integer val = itr2.next();
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
