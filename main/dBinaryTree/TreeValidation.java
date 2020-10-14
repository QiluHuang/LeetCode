package dBinaryTree;

public class TreeValidation {
    /** Check Same */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return p.val == q.val && left && right;
    }

    /** Check Symmetric */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isSymmetricHelper(root.left, root.right);
    }

    public static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        Boolean leftRes = isSymmetricHelper(left.left, right.right);
        Boolean rightRes = isSymmetricHelper(left.right, right.left);

        return left.val == right.val && leftRes && rightRes;
    }


    /** Check Balanced */
    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        isBalancedHelper(root);

        return res;
    }

    private int isBalancedHelper(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = isBalancedHelper(root.left);
        int rightHeight = isBalancedHelper(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) res = false;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
