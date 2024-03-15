class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int lsum=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            lsum+=nums[i];
            left[i]=lsum;
            rsum+=nums[nums.length-1-i];
            right[nums.length-1-i]=rsum;
        }
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}