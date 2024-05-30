class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<right){
            if(nums[left]+nums[right]==0){
                return nums[right];
            }
            if(nums[left]+nums[right]>0){
                right--;
            }
            else{
                left++;
            }
        }
        return -1;  


        //s
    }
}