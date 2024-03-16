class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(n==0 || n==1){
            return ans;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count--;
            }
            else{
                count++;
            }
            if(count==0){
                ans=i+1;
            }
            if(map.containsKey(count)){
                ans=Math.max(ans,i-map.get(count));
            }
            else{
                map.put(count,i);
            }
        }
        return ans;
    }
}