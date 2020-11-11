package dBinaryTree;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTraversalTest {
    // instance filed
    private static TreeNode root;
    private static TreeNode emptyTree;

    @BeforeClass
    public static void setUp() {
        // 常规
        root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(7);

        root.left = left;
        root.right = right;

        // 空树
        emptyTree = null;
    }

    @Test
    public void preOrderTest() {
        List<Integer> result = BinaryTreeTraversal.preorderTraversalIteratively(root);
        assertEquals(List.of(5, 3, 7), result);
    }

    @Test
    public void postOrderTest() {
        List<Integer> result = BinaryTreeTraversal.postorderTraversalRecursively(root);
        assertEquals(List.of(3,7,5), result);
    }

    @Test
    public void levelOrderTest() {
//        List<Integer> res = BinaryTreeTraversal.levelorderTraversalIteratively(root);
//        assertEquals(List.of(5,3,7), res);

        List<List<Integer>> res2 = BinaryTreeTraversal.levelOrderBottom(emptyTree);
//        assertEquals([], res2);
    }

    @Test
    public void testHappyPath() {
        List<Integer> result = BinaryTreeTraversal.postorderTraversalRecursively(root);
        assertEquals(List.of(3,7,5), result);
    }


}

