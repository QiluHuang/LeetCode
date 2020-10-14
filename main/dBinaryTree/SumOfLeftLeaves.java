package dBinaryTree;

public class SumOfLeftLeaves {
    static int res;

    public static int sumOfLeftLeaves(TreeNode root) {
        res = 0;
        if (root != null) {
            preorderTraversal(root);
        }

        return res;
    }

    private static void preorderTraversal(TreeNode root) {
        if (root == null || root.getLeft() == null) return;
        if (root.getLeft() == null && root.getRight() == null) return;

        if (root.getLeft().getLeft() == null && root.getLeft().getRight() == null) {
            res += root.getLeft().getVal();
        }

        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }
}
