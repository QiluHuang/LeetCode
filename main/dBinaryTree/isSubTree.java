package dBinaryTree;

public class isSubTree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        boolean res = false;

        if (s.getVal() == t.getVal()) {
            res = isSameTree(s, t);
        }

        if (!res) {
            res = isSubtree(s.getLeft(), t) || isSubtree(s.getRight(), t);
        }

        return res;
    }

    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        return s.getVal() == t.getVal() && isSameTree(s.getLeft(), t.getLeft()) && isSameTree(s.getRight(), t.getRight());
    }
}
