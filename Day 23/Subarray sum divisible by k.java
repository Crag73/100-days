class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int arr[]=new int[k];
        int sum=0;
        int rem=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(arr[rem]>0){
                ans+=arr[rem];
                arr[rem]++;
            }
            else{
                arr[rem]++;
            }
            if(rem==0){
                ans++;
            }   
        }
        return ans;
    }
}