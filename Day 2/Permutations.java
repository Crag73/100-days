class Solution {
    public void solve(int[] nums,List<Integer> cur,boolean freq[],List<List<Integer>> ans){
        if(cur.size()==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                cur.add(nums[i]);
                solve(nums,cur,freq,ans);
                cur.remove(cur.size()-1);
                freq[i]=false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        solve(nums,cur,freq,ans);
        return ans;

    }
}