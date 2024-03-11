class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        int ans=0;
        for(int i:s){
            if(!s.contains(i-1)){
                int temp=i;
                int count=0;
                while(s.contains(temp++)){
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}