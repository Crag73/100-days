public class Solution {

    public static int bs(int []nums,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            return bs(nums,target,mid+1,right);
        }   
        if(nums[mid]>target){
            return bs(nums,target,left,mid-1);
        }
        return -1;
    }
    public static int search(int []nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
}