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
    public int solve(TreeNode root,int[] maxi){
        if(root==null){
            return 0;
        }
        int left=solve(root.left,maxi);
        int right=solve(root.right,maxi);
        maxi[0]=Math.max(maxi[0],left+right);
        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[]={0};
        solve(root,dia);
        return dia[0];
    }

}