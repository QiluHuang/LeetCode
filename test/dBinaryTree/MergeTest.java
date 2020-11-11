package dBinaryTree;

import org.junit.BeforeClass;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeTest {
    private static TreeNode t1;
    private static TreeNode t2;

    @BeforeClass
    public static void setUp() {
        t1 = new TreeNode(1);

        TreeNode node11 = new TreeNode(3);
        TreeNode node12 = new TreeNode(2);
        TreeNode node13 = new TreeNode(5);

        t1.left = node11;
        t1.right = node12;
        node11.left = node13;


        t2 = new TreeNode(2);

        TreeNode node21 = new TreeNode(1);
        TreeNode node22 = new TreeNode(3);
        TreeNode node23 = new TreeNode(4);
        TreeNode node24 = new TreeNode(7);

        t2.left = node21;
        t2.right = node22;
        node21.right = node23;
        node22.right = node24;
    }

    @Test
    public void mergeTest() {
        TreeNode res = Merge.mergeTrees(t1, t2);

        List<Integer> list = BinaryTreeTraversal.levelorderTraversalIteratively(res);
        List<Integer> test = List.of(3,4,5,5,4,7);

        assertEquals(test, list);
    }
}
