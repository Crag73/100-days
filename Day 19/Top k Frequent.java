class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            return nums;
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> arr=new ArrayList<>(n+1);
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }
        for(Map.Entry <Integer,Integer> i : mp.entrySet()){
            int num=i.getKey();
            int frq=i.getValue();
            arr.get(frq).add(num);
        }
        int ans[] =new int[k];
        int index=0;
        for (int i=n;i>=0 && index<k;i--) {
            List<Integer> bucket=arr.get(i);
            for (int num:bucket) {
                ans[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }
        return ans;
    }
}