package dBinaryTree;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetMinimumDifferenceTest {
    @Test
    public void generalTest() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2);

        node1.setRight(node2);
        node2.setLeft(node3);

        int res = GetMinimumDifference.getMinimumDifference(node1);
        assertEquals(1,res);
    }
}
