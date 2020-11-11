package aBacktracking;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

public class CombinationArrayTest {
    /**
     * 39. Combination Sum
     */
    @Test
    public void combinationSum() {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> res = CombinationArray.combinationSum(candidates, 7);

        Iterator<List<Integer>> itr = res.iterator();
        while (itr.hasNext()) {
            List<Integer> list = itr.next();
            Iterator<Integer> itr2 = list.iterator();
            while(itr2.hasNext()) {
                Integer val = itr2.next();
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



}
