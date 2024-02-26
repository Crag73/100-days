class Solution {
    public  void solve(int index,int[] nums,List<Integer> cur,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        solve(index+1,nums,cur,ans);
        cur.add(nums[index]);
        solve(index+1,nums,cur,ans);
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        solve(0,nums,cur,ans);
        return ans;
    }
}