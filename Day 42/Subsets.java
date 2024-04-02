class Solution {
    public void solve(List<List<Integer>>ans,List<Integer>cur,int[] nums,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        solve(ans,cur,nums,i+1);
        cur.add(nums[i]);
        solve(ans,cur,nums,i+1);
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        solve(ans,cur,nums,0);
        return ans;
    }
}