class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int temp = sum - k;
            if (mp.containsKey(temp)) {
                ans += mp.get(temp);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}