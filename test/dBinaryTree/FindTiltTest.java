package dBinaryTree;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindTiltTest {

    private static TreeNode emptyTree;
    private static TreeNode generalTree;

    @BeforeClass
    public static void setUp() {
        emptyTree = null;

        generalTree = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        generalTree.left = node1;
        generalTree.right = node2;
    }

    @Test
    public void generalTreeTest() {
        assertEquals(1,FindTilt.findTilt(generalTree));
    }
}
