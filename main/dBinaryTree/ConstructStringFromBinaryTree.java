package dBinaryTree;

public class ConstructStringFromBinaryTree {
    public static String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        else if (t.left == null && t.right == null) {
            return "(" + t.getVal() + ")";
        }

        else if (t.left != null && t.right == null) {
            return  t.getVal() + tree2str(t.left);
        }

        else if (t.left == null && t.right != null) {
            return "(" + t.getVal() + "()" + tree2str(t.right) + ")";
        }

        else {
            return t.getVal() + tree2str(t.left) + tree2str(t.right);
        }
    }
}
