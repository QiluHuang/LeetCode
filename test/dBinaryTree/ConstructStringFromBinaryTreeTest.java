package dBinaryTree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConstructStringFromBinaryTreeTest {
    @Test
    public void testOne() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        String res = ConstructStringFromBinaryTree.tree2str(node1);
        assertEquals("1(2(4))(3)", res);
    }

    public void testTwo() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node2.left = node3;
        node2.right = node4;

        String res = ConstructStringFromBinaryTree.tree2str(node1);
        assertEquals("1(2(3)(4))", res);
    }
}
