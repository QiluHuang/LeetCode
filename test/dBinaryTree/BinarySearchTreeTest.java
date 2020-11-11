package dBinaryTree;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;




public class BinarySearchTreeTest {
    private static TreeNode root;
    private static TreeNode emptyTree;

    @BeforeClass
    public static void setUp() {
        root = new TreeNode(33);

        TreeNode node2 = new TreeNode(17);
        TreeNode node3 = new TreeNode(50);

        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(18);
        TreeNode node6 = new TreeNode(34);
        TreeNode node7 = new TreeNode(58);

        TreeNode node8 = new TreeNode(16);
        TreeNode node9 = new TreeNode(25);
        TreeNode node10 = new TreeNode(51);
        TreeNode node11 = new TreeNode(66);

        TreeNode node12 = new TreeNode(19);
        TreeNode node13 = new TreeNode(27);


        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        node4.right = node8;
        node5.right = node9;
        node7.left = node10;
        node7.right = node11;

        node9.left = node12;
        node9.right = node13;


        emptyTree = null;
    }


    @Test
    public void queryTest() {
        Boolean res = BinarySearchTree.query(root, 34);
        assertEquals(true, res);
    }


    @Test
    public void searchTest() {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);

        TreeNode res = BinarySearchTree.searchBST(node1, 2);
        assertEquals(node2, res);
    }


    @Test
    public void insertTest() {
        BinarySearchTree.insert(root, 55);

        List<Integer> list = BinaryTreeTraversal.levelorderTraversalIteratively(root);
        List<Integer> test = List.of(33,17,50,13,18,34,58,16,25,51,66,19,27,55);

        assertEquals(test, list);
    }

    @Test
    public void insertCornerTest() {
        BinarySearchTree.insert(emptyTree, 3);

        List<Integer> list = BinaryTreeTraversal.levelorderTraversalIteratively(emptyTree);
        List<Integer> test = List.of(3);

        assertEquals(test, list);
    }

    @Test
    public void deleteNodeTest() {
        BinarySearchTree.deleteNode(root, 13);

        //13,16,17,18,19,25,27,33,34,50,51,58,66
        List<Integer> list = BinaryTreeTraversal.inorderTraversalRecursively(root);
        List<Integer> test1 = List.of(16,17,18,19,25,27,33,34,50,51,58,66);      // deleted node with one child 13
        List<Integer> test2 = List.of(13,16,17,18,19,25,33,34,50,51,58,66);      // deleted node without children 27
        List<Integer> test3 = List.of(13,16,17,19,25,27,33,34,50,51,58,66);   // deleted node with children 18


        assertEquals(test1,list);
    }
}
