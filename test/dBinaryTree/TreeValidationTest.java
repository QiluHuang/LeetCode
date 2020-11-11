package dBinaryTree;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TreeValidationTest {
    private static TreeNode emptyTree;
    private static TreeNode treeWithOnlyOneNode;

    private static TreeNode leftTree;
    private static TreeNode rightTree;

    private static TreeNode symmetricTree;
    private static TreeNode asymmetricTree;


    @BeforeClass
    public static void sameTreeSetUp() {
        leftTree = new TreeNode(1);
        
    }

    @BeforeClass
    public static void symmetricTreeTestSetUp() {
        emptyTree = null;


        treeWithOnlyOneNode = new TreeNode(1);


        symmetricTree = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);

        symmetricTree.left = node1;
        symmetricTree.right = node2;

        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;


        asymmetricTree = new TreeNode(1);

        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(2);

        TreeNode node9 = new TreeNode(3);
        TreeNode node10 = new TreeNode(3);

        asymmetricTree.left = node7;
        asymmetricTree.right = node8;

        node7.right = node9;
        node8.right = node10;
    }

    @Test
    public void isSymmetricTest() {
        // Symmetric Tree
        assertEquals(true, TreeValidation.isSymmetric(symmetricTree));
        
        // Asymmetric Tree
        assertEquals(false, TreeValidation.isSymmetric(asymmetricTree));

        // Empty Tree
        assertEquals(true, TreeValidation.isSymmetric(emptyTree));

        // Tree with only one node
        assertEquals(true, TreeValidation.isSymmetric(treeWithOnlyOneNode));
    }
}
