class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int left = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            int num = nums[right];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            while (freqMap.size() > k) {
                int leftNum = nums[left];
                left++;
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
            }
            count += right - left + 1;
        }
        return count;
    }
}