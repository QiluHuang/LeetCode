package dBinaryTree;

import java.util.*;

public class BinaryTreeTraversal {
    /** pre-order traversal*/
    public List<Integer> preorderTraversalRecursively(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        preorderTraversalRecursivelyHelper(root, res);
        return res;
    }

    private void preorderTraversalRecursivelyHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        preorderTraversalRecursivelyHelper(root.left, list);
        preorderTraversalRecursivelyHelper(root.right, list);
    }


    public static List<Integer> preorderTraversalIteratively(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        stack.push(curr);


        while(!stack.empty()){
            curr = stack.pop();
            list.add(curr.getVal());
            if(curr.getLeft()!=null) stack.push(curr.getLeft());
            if(curr.getRight()!=null) stack.push(curr.getRight());
        }


        return list;
    }


    /** in-order traversal */
    public static List<Integer> inorderTraversalRecursively(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        inorderTraversalHelper(root, res);

        return res;
    }

    private static void inorderTraversalHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
    }



    public static List<Integer> postorderTraversalRecursively(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        postorderTraversalHelper(root, res);

        return res;
    }

    private static void postorderTraversalHelper(TreeNode root, List<Integer> list) {
        if(root==null) return;

        //postorder: left - right - root
        postorderTraversalHelper(root.left, list);
        postorderTraversalHelper(root.right, list);
        list.add(root.val);
    }



    /** level-order traversal */
    public static List<Integer> levelorderTraversalIteratively(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeNode curr;
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
                list.add(curr.val);
            }
        }

        return list;
    }

    // wrap List top down
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        levelOrderHelper(root, res);
        return res;
    }

    private static List<List<Integer>> levelOrderHelper(TreeNode root, List<List<Integer>> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int size = queue.size();
            TreeNode curr;
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
                subList.add(curr.val);
            }
            list.add(subList);
        }

        return list;
    }


    // wrap List from bottom up
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();

        if (root == null) return res;

        levelOrderBottomHelper(root, res);

        return res;
    }

    private static List<List<Integer>> levelOrderBottomHelper(TreeNode root, List<List<Integer>> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int size = queue.size();
            TreeNode curr;
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);

                subList.add(curr.val);
            }
            list.add(0, subList);
        }

        return list;
    }

}

