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
    public void solve(TreeNode root,Map<Integer,Integer> ans,int h){
        if(root==null){
            return;
        }
        if(!ans.containsKey(h)){
            ans.put(h,root.val);
        }
        solve(root.left,ans,h+1);
        solve(root.right,ans,h+1);

    }
    public int findBottomLeftValue(TreeNode root) {
        Map<Integer,Integer> ans=new HashMap<>();
        solve(root,ans,0);
        int ret=root.val;
        for(Map.Entry<Integer,Integer> i: ans.entrySet()){
            ret=i.getValue();
        }
        return ret;
    }
}