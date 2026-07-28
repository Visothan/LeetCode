/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public boolean check(TreeNode root, int index, int total) {

        if (root == null) {
            return true;
        }

        // If index is >= total, there is a gap
        if (index >= total) {
            return false;
        }

        return check(root.left, 2 * index + 1, total)
            && check(root.right, 2 * index + 2, total);
    }

    public boolean isCompleteTree(TreeNode root) {

        int total = countNodes(root);

        return check(root, 0, total);
    }
}