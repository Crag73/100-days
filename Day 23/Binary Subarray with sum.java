class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0;
        int sum=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum-goal)){
                ans+=mp.get(sum-goal);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}