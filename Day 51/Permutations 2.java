class Solution {
    public void swap(int[] nums,int index,int i){
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
    }
    public void solve(int[]nums,List<List<Integer>> ans,int index){
        if(index==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && (nums[i]==nums[i-1] || nums[i]==nums[index])){
                continue;
            }
            swap(nums,index,i);
            solve(nums,ans,index+1);
        }
        for(int i=index;i<nums.length-1;i++){
            swap(nums,i,i+1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,ans,0);
        return ans;
    }
}