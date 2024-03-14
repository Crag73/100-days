class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                str+=s.charAt(i);
            }
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(str.length()-i-1)!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}