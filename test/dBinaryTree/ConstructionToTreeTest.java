package dBinaryTree;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class ConstructionToTreeTest {
    private static int[] test;
    @BeforeClass
    public static void setUp() {
        test = new int[]{3,2,1,6,0,5};
    }

    @Test
    public void maximumBinaryTreeTest() {
        TreeNode res = ConstructionToTree.constructMaximumBinaryTree(test);

        List<Integer> resList = BinaryTreeTraversal.levelorderTraversalIteratively(res);
        List<Integer> expectList = List.of(6,3,5,2,0,1);

        assertEquals(expectList, resList);
    }
}
