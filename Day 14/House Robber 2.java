class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int take=solve(nums,0,nums.length-1);
        int nottake=solve(nums,1,nums.length);
        return Math.max(take,nottake);
    }
    int solve(int[] nums,int start,int end){
        int prev=0;
        int prevnot=0;
        for(int i=start;i<end;i++){
            int cur=prevnot+nums[i];
            int cur_not=Math.max(prev,prevnot);
            prevnot=cur_not;
            prev=cur;
        }
        return Math.max(prevnot,prev);
    }
}