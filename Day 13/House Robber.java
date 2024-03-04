class Solution {

    // public int solve(int rob,int money,int[] nums,int[] dp){
    //     if(rob>=nums.length){
    //         return 0;
    //     }
    //     if(dp[rob]!=-1){
    //         return dp[rob];
    //     }
    //     int take=nums[rob]+solve(rob+2,money+nums[rob],nums,dp);
    //     int not=solve(rob+1,money,nums,dp);
    //     return dp[rob]=Math.max(take,not);
    // }
    public int rob(int[] nums) {
        // int dp[]=new int[nums.length+1];
        // return solve(0,0,nums,dp);
        if(nums.length==0){
            return 0;
        }
        // dp[0]=0;
        // dp[1]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        // }
        // return dp[nums.length];
        int prev=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            int temp=prev;
            prev=Math.max(prev,cur+nums[i]);
            cur=temp;
        }
        return prev;
    }
}