class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }
        int pre=0;
        int suf=n-1;
        int ans=n;
        int len=0;
        while(pre<suf){
            if(s.charAt(pre)!=s.charAt(suf)){
                break;
            }
            else{
                if(pre+1 <suf && s.charAt(pre)==s.charAt(pre+1)){
                    pre++;
                    len++;
                }
                else if(suf-1>pre && s.charAt(suf)==s.charAt(suf-1)){
                    suf--;
                    len++;
                }
                else{
                    pre++;
                    suf--;
                    len+=2;
                }
            }
        }
        return ans-len;
    }
}