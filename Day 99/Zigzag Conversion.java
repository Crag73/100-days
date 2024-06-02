class Solution {
    public String convert(String s, int n) {
        char[] c=s.toCharArray();
        int len=c.length;
        StringBuffer[] sb=new StringBuffer[n];
        for(int i=0;i<sb.length;i++){
            sb[i]=new StringBuffer();
        }
        int i=0;
        while(i<len){
            for(int index=0;index<n && i<len;index++){
                sb[index].append(c[i++]);
            }
            for(int index=n-2;index>=1 && i<len;index--){
                sb[index].append(c[i++]);
            }
        }
        for(int index=1;index<sb.length;index++){
            sb[0].append(sb[index]);
        }
        return sb[0].toString();
    }
}