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
    public void solve(TreeNode root,int col,int row,Map<Integer,List<int[]>> mp){
        if(root==null){
            return;
        }
        List<int[]> temp=mp.getOrDefault(col,new ArrayList<>());
        temp.add(new int[]{row,root.val});
        mp.put(col,temp);
        solve(root.left,col-1,row+1,mp);
        solve(root.right,col+1,row+1,mp);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Map<Integer,List<int[]>> mp=new TreeMap<>();
        solve(root,0,0,mp);
        for(Map.Entry<Integer,List<int[]>> i: mp.entrySet()){
            List<int[]> val=i.getValue();
            Collections.sort(val,(a,b)->{
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }
                else{
                    return a[0]-b[0];
                }
            });
            List<Integer> ansVal=new ArrayList<>();
            for(int[] temp:val){
                ansVal.add(temp[1]);
            }
            ans.add(ansVal);
        }
        return ans;
    }
}