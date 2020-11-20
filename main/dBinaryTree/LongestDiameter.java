package dBinaryTree;

/** 543. Diameter of Binary Tree */
public class LongestDiameter {
    private static int maxDiameter;

    public static int getLongestDiameter(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        maxDiameter = Integer.MIN_VALUE;
        getLongestDiameterDFS(root);
        return maxDiameter;
    }


    private static int getLongestDiameterDFS(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = getLongestDiameterDFS(root.left) + 1;
        }
        if (root.right != null) {
            rightHeight = getLongestDiameterDFS(root.right) + 1;
        }
        int currLongestDiameter = leftHeight + rightHeight;
        System.out.println("curr diameter: " + currLongestDiameter);
        maxDiameter = Math.max(maxDiameter, currLongestDiameter);

        return Math.max(leftHeight, rightHeight);
    }

    /*
    data structure:



     for curr node:
     int left = get left longest path
     int right = get right longest path
     curr node longest diameter = left + right
     update maxDiameter

     */

}
