package dBinaryTree;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isSubTreeTest {
    @Test
    public void generalTest() {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(0);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node4.setLeft(node6);

        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(2);

        node7.setLeft(node8);
        node7.setRight(node9);

        boolean res = isSubTree.isSubtree(node1, node7);
        assertEquals(false, res);
    }
}
