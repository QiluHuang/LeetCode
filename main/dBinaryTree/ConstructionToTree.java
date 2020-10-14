package dBinaryTree;

import java.util.HashMap;

public class ConstructionToTree {

    /** 105. Construct Binary Tree from Preorder and Inorder Traversal */
    public static TreeNode buildTreeFromPreorder(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null || preorder.length!=inorder.length) return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildTreeFromPreorderHelper(preorder, inorder,
                0, //preorder.length-1,
                0, inorder.length-1, map);
    }

    private static TreeNode buildTreeFromPreorderHelper(int[] preorder, int[] inorder,
                                            int preStart, //int preEnd,
                                            int inStart, int inEnd,
                                            HashMap<Integer, Integer> map){
        //base case
        if(inStart>inEnd || preStart>preorder.length-1) return null;

        //create a node[root]
        int rootVal = preorder[preStart];   //get its value from pre-order
        TreeNode root = new TreeNode(rootVal);

        // find the index of root in in-order
        int index = map.get(rootVal);

        // construct a Tree
        root.left = buildTreeFromPreorderHelper(preorder, inorder,
                preStart+1, //preStart+index-inStart,
                inStart, index-1,
                map);

        root.right = buildTreeFromPreorderHelper(preorder, inorder,
                preStart+index-inStart+1, //preEnd,
                index+1, inEnd,
                map);

        return root;
    }

    /** 106. Construct Binary Tree from Inorder and Postorder Traversal */
    public TreeNode buildTreeFromPostorder(int[] inorder, int[] postorder) {
        //corner case
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildTreeFromPostorderHelper(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1, map);
    }

    private TreeNode buildTreeFromPostorderHelper(int[] inorder, int[] postorder,
                            int inStart, int inEnd,
                            int postStart, int postEnd,
                            HashMap<Integer, Integer> map){
        //base case
        if(inStart>inEnd || postStart<0) return null;

        //create a node[root]
        int nodeVal = postorder[postEnd];
        TreeNode node = new TreeNode(nodeVal);

        //finde the index in in-order
        int index = map.get(nodeVal);

        //create a tree
        node.left = buildTreeFromPostorderHelper(inorder, postorder,
                inStart, index-1,
                postStart, postStart+index-1-inStart,
                map);

        node.right = buildTreeFromPostorderHelper(inorder, postorder,
                index+1, inEnd,
                postStart+index-inStart, postEnd-1,
                map);

        return node;
    }


    /** 654. Maximum Binary Tree */
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) return null;

        TreeNode root = constructMaximumBinaryTreeHelper(nums, 0, nums.length - 1);

        return root;
    }

    // construct a tree
    private static TreeNode constructMaximumBinaryTreeHelper(int[] nums, int left, int right) {
        if (left > right) return null;

        int index = findMaximumNumIndex(nums, left, right);
        TreeNode node = new TreeNode(nums[index]);

        TreeNode leftNode = constructMaximumBinaryTreeHelper(nums, left, index - 1);
        TreeNode rightNode = constructMaximumBinaryTreeHelper(nums, index + 1, right);

        node.left = leftNode;
        node.right = rightNode;

        return node;
    }

    // find the index of maximum num in the array
    private static int findMaximumNumIndex(int[] nums, int left, int right) {
        int max = nums[left];
        int index = left;
        while (left <= right) {
            if (nums[left] > max) {
                index = left;
                max = nums[left];
            }
            left++;
        }
        return index;
    }




}
