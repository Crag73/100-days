class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans=0;
        int n=tokens.length;
        int cur=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(tokens[left]<=power){
                power-=tokens[left];
                left++;
                cur++;
            }
            else if(cur>0){
                power+=tokens[right];
                right--;
                cur--;
            }
            else{
                break;
            }
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}