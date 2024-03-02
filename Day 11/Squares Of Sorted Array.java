class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if (nums[0] >= 0) {
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }
        int arr[] = new int[n];
        int left = 0;
        int right = 0;
        while (left < n && nums[left] < 0) {
            right++;
            left++;
        }
        int count = 0;
        while (left > 0 && right < n) {
            if (nums[left - 1] * nums[left - 1] < nums[right] * nums[right]) {
                arr[count] = nums[left - 1] * nums[left - 1];
                left--;
            } else {
                arr[count] = nums[right] * nums[right];
                right++;
            }
            count++;
        }
        while (right < n && count < n) {
            arr[count] = nums[right] * nums[right];
            right++;
            count++;
        }
        while (left >= 0 && count < n) {
            arr[count] = nums[left - 1] * nums[left - 1];
            left--;
            count++;
        }
        return arr;
    }
}