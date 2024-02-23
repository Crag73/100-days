public class Solution {
    public static int NthRoot(int n, int m) {
        int left=0;
        int right=m;
        while(left<=right){
            int mid=left+(right-left)/2;
            int power=(int)Math.pow(mid,n);
            if(power==m){
                return mid;
            }
            if(power>m){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
