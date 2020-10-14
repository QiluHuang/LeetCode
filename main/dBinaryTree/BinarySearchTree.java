package dBinaryTree;

public class BinarySearchTree {
    public static boolean query(TreeNode root, int num) {
        if (root == null) {
            return false;
        }

        if (root.val() == num) {
            return true;
        }

        return num < root.val() ? query(root.getLeft(), num) : query(root.getRight(), num);
    }


    static TreeNode res;
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.getVal() == val) {
            res = root;
        } else if (root.getVal() < val) {
            searchBST(root.getRight(), val);
        } else if (val < root.getVal()) {
            searchBST(root.getLeft(), val);
        }

        return res;
    }


    public static void insert(TreeNode root, int num) {
        if (root == null) {
            root.val = num;
        } else if (root.val < num) {
            if (root.right == null) {
                root.right = new TreeNode(num);
            } else {
                insert(root.right, num);
            }
        } else if (num < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(num);
            } else {
                insert(root.left, num);
            }
        }
    }


    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    private static TreeNode findMin(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left != null) {
            return findMin(root.left);
        }

        return root;
    }
}
