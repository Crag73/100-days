class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int n=happiness.length;
        for(int i=0;i<k;i++){
            if((happiness[n-i-1]-i)<0){
                return ans;
            }
            ans+=(happiness[n-i-1]-i);
        }
        return ans;
    }
}