class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int len=0;
        int sp=0;
        int[] map=new int[257];
        Arrays.fill(map,-1);
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)]==-1){
                map[s.charAt(i)]=1;
                len++;
                ans=Math.max(ans,len);
            }
            else{
                while(map[s.charAt(i)]!=-1){
                    map[s.charAt(sp)]=-1;
                    sp++;
                    len--;
                }
                map[s.charAt(i)]=1;
                len++;
            }
        }
        ans=Math.max(ans,len);
        return ans;
    }
}