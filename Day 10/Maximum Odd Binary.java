class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int no_of_one=0;
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                no_of_one++;
            }
        }
        while(no_of_one!=1){
            ans+="1";
            n--;
            no_of_one--;
        }
        while(n!=1){
            ans+="0";
            n--;
        }
        ans+="1";
        return ans;
    }
}