package dBinaryTree;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfLeftLeavesTest {
    @Test
    public void generalTest() {
        TreeNode node1 = new TreeNode(-9);
        TreeNode node2 = new TreeNode(-3);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(-6);
        TreeNode node8 = new TreeNode(-5);

        node1.left = node2;
        node1.left = node3;
        node2.right = node4;
        node4.left = node7;
        node3.left = node5;
        node3.right = node6;
        node5.left = node8;

        int res = SumOfLeftLeaves.sumOfLeftLeaves(node1);
        assertEquals(-11, res);

    }
}
