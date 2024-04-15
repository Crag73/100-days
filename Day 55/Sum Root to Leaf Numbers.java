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
    public void solve(TreeNode root,String cursum,int ans[]){
        if(root==null){
            return;
        }
        cursum+=Integer.toString(root.val);
        if(root.left==null && root.right==null){
            ans[0]+=Integer.parseInt(cursum);
            return;
        }
        solve(root.left,cursum,ans);
        solve(root.right,cursum,ans);
    }
    public int sumNumbers(TreeNode root) {
        int [] ans={0};
        solve(root,"",ans);
        return ans[0];
    }
}