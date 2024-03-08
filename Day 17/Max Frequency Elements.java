class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans=0;
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer> i:mp.entrySet()){
            if(i.getValue()>max){
                max=i.getValue();
                ans=i.getValue();
            }
            else if(i.getValue()==max){
                ans+=i.getValue();
            }
        }
        return ans;
    }
}