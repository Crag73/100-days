class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        if(k==0){
            return 0;
        }
        int ans=0;
        int n=nums.length;
        int left=0;
        int right=0;
        while(right<n){
            if(mp.containsKey(nums[right])){
                mp.put(nums[right],mp.get(nums[right])+1);
                while(mp.get(nums[right])>k && left<=right){
                   mp.put(nums[left],mp.get(nums[left])-1);
                    left++;
                }
            }
            else{
                mp.put(nums[right],1);
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}