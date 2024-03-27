class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int left=0;
        int right=0;
        int n=nums.length;
        long cur=1;
        while(right!=n){
            cur*=nums[right];
            while(cur>=k && left<=right){
                cur/=nums[left];
                left++;
            }
            ans+=right-left+1;
            right++;
        }
        return ans;
    }
}