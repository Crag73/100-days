class Solution {
    public int nsum(int n){
        return (n*(n+1))/2;
    }
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int total=nsum(n);
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            int temp=nsum(mid);
            if(temp==total-temp+mid){
                return mid;
            }
            if(temp>total-temp+mid){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}