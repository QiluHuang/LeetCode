package dBinaryTree;

public class FindTilt {
    private static int res;

    public static int findTilt(TreeNode root) {
        res = 0;

        findTiltHelper(root);

        return res;
    }

    private static int findTiltHelper(TreeNode root) {
        if (root == null) return 0;

        int left = findTiltHelper(root.left);
        int right = findTiltHelper(root.right);

        if (root.left == null && root.right == null) {
            res += 0;
        } else {
            res += Math.abs(left - right);
        }

        return root.val + left + right;
    }
}
