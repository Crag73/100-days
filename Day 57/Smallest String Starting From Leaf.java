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
    public String solve(TreeNode root,StringBuilder cur,String ans){
        if(root==null){
            return ans;
        }
        cur.append((char)('a'+root.val));
        if(root.left==null && root.right==null){
            String curString=cur.reverse().toString();
            if(ans.length()==0 || curString.compareTo(ans)<1){
                ans=curString;
            }
            cur.reverse();
        }
        ans=solve(root.left,cur,ans);
        ans=solve(root.right,cur,ans);
        cur.deleteCharAt(cur.length()-1);
        return ans;
    }
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder cur=new StringBuilder();
        String ans="";
        return solve(root,cur,ans);
    }
}