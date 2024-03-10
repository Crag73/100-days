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
    public void solve(TreeNode root, int[] ans, TreeNode[] prev) {
        if (root == null) {
            return;
        }

        solve(root.left, ans, prev);

        if (prev[0] != null) {
            ans[0] = Math.min(ans[0], Math.abs(root.val - prev[0].val));
        }

        prev[0] = root;

        solve(root.right, ans, prev);
    }
    public int getMinimumDifference(TreeNode root) {
        int[] ans = new int[]{Integer.MAX_VALUE / 2};
        TreeNode[] prev = new TreeNode[]{null};
        solve(root, ans, prev);
        return ans[0];
    }
}