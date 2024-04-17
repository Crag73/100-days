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
    public void solve(TreeNode root,int val,int depth,int level){
        if(root==null || level>depth){
            return;
        }
        if(level==depth){
            TreeNode templ=root.left;
            TreeNode tempr=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=templ;
            root.right.right=tempr;
        }
        solve(root.left,val,depth,level+1);
        solve(root.right,val,depth,level+1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode temp=root;
            TreeNode ans=new TreeNode(val);
            ans.left=root;
            return ans;
        }
        solve(root,val,depth,2);
        return root;
    }
}