class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==1){
            if(nums[0]==target){
                return 0;
            }
            return -1;
        }
        if(n==2){
            if(nums[0]==target){
                return 0;
            }
            if(nums[1]==target){
                return 1;
            }
            return -1;
        }
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[left]){
                if(nums[mid]>=target && target>=nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                  left=mid+1;
                }
                else{
                  right=mid-1;
                }
            }
        }
        return -1;

    }
}