class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=n;
        if(n<=1){
            return 0;
        }
        // Map<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }
        // int max_present=0;
        // for(int i=0;i<n;i++){
        //     max_present=0;
        //     for(int j=nums[i]+1;j<nums[i]+n;j++){
        //         if(mp.containsKey(j)){
        //             max_present++;
        //         }
        //     }
        //     ans=Math.max(max_present,ans);
        // }
        // return n-ans-1;
        SortedSet<Integer> arr=new TreeSet<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        Integer[] arr2 = arr.toArray(new Integer[0]);
        int right=0;
        for(int left=0;left<arr2.length;left++){
            while(right<arr2.length && arr2[right]<arr2[left]+n){
                right+=1;
            }
            ans=Math.min(ans,n-(right-left));
        }
        return ans;
    }
}