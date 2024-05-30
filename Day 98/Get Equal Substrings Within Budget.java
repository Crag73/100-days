class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans=0;
        int n=s.length();
        int cur=0;
        int left=0;
        for(int i=0;i<n;i++){
            cur+=Math.abs(s.charAt(i)-t.charAt(i));
            while(cur>maxCost){
                cur-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}