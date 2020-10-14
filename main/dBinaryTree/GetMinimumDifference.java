package dBinaryTree;

public class GetMinimumDifference {
    private static int min = Integer.MAX_VALUE;
    private static TreeNode pre = null;

    public static int getMinimumDifference(TreeNode root) {
        inorderTraversal(root, min, pre);
        return min;
    }

    private static void inorderTraversal(TreeNode root, int min, TreeNode pre) {
        if (root == null) return;

        inorderTraversal(root.getLeft(), min, pre);

        if (pre != null) {
            min = Math.min(min, Math.abs(pre.getVal() - root.getVal()));
        }
        pre = root;

        inorderTraversal(root.getRight(), min, pre);
    }
}
