class Solution {
    public String largestOddNumber(String num) {
        StringBuffer ans=new StringBuffer();
        int n=num.length();
        boolean flag=false;
        for(int i=n-1;i>=0;i--){
            if(flag==false){
                if((num.charAt(i)-'0')%2!=0){
                    ans.append(num.charAt(i));
                    flag=true;
                }
            }
            else{
                ans.append(num.charAt(i));
            }
        }
        ans.reverse();
        return ans.toString();
    }
}