package aBacktracking;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

public class CombinationIntTest {
    /**
     * 77. Combinations
     **/
    @Test
    public void combineTest() {
        List<List<Integer>> res = CombinationInt.combine(4, 2);

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

    /**
     * 254 Factor Combinations
     **/
    @Test
    public void getFactorsTest() {
        List<List<Integer>> res = CombinationInt.getFactors(32);

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
