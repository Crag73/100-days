class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int i=0;
        int n=str.length;
        while(n-i-1>=0 && str[n-i-1].length()==0){
            i++;
        }
        return str[n-1-i].length();
    }
}