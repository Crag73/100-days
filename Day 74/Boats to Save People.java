class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int ans=0;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]+arr[right]<=limit){
                left++;
            }
            right--;
            ans++;
        }
        //s
        return ans;
    }
}