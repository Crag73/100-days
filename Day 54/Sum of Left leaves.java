class Solution {

    static int res;

    public int sumOfLeftLeaves(TreeNode root) {
        res = 0;
        solve(root, false);
        return res;
    }

    public void solve(TreeNode node, boolean isLeft) {
        if (node==null) {
            return;
        }
        if (node.left==null && node.right==null) {
            if (isLeft) {
                res+=node.val;
            }
            return;
        }
        solve(node.left, true);
        solve(node.right, false);
    }
}