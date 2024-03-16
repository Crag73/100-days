class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int profit=0;
        while(right<prices.length){
            profit=Math.max(profit,prices[right]-prices[left]);
            if(prices[left]>prices[right] && left<=right){
                left++;
            }
            else{
                right++;
            }
        }
        return profit;
    }
}