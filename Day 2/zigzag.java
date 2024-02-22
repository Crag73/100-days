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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean rtl=true;
        while(!q.isEmpty()){
            int siz=q.size();
            List<Integer> arr=new ArrayList<Integer>(siz);
            for (int i = 0; i < siz; i++) {
                arr.add(0);
            }
            for(int i=0;i<siz;i++){
                TreeNode node=q.peek();
                q.remove();
                int index= (rtl) ? i:(siz-1-i);
                arr.set(index,node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(arr);
            rtl=!rtl;
        }
        return ans;
    }
}