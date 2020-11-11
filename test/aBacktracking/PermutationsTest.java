package aBacktracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {
    @Test
    public void permutateTest() {
        int[] arr = {1,2,3};
        List<List<Integer>> res = Permutations.permute(arr);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(1,2,3));
        expect.add(Arrays.asList(1,3,2));
        expect.add(Arrays.asList(2,1,3));
        expect.add(Arrays.asList(2,3,1));
        expect.add(Arrays.asList(3,1,2));
        expect.add(Arrays.asList(3,2,1));
        assertEquals(expect, res);
    }
}