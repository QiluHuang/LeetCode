package dBinaryTree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvertTreeTest {
    private static TreeNode root;

    @BeforeClass
    public static void setUp() {
        root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
    }

    @Test
    public void invertTree() {
        TreeNode res = InvertTree.invertTree(root);

        List<Integer> list = BinaryTreeTraversal.levelorderTraversalIteratively(res);
        List<Integer> test = List.of(4,7,2,9,6,3,1);

        assertEquals(test, list);
    }

}
