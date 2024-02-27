class Solution {
    public boolean solve(int n,int cur){
        if(cur==n){
            return true;
        }
        if(cur>n||cur<=0){
            return false;
        }
        return solve(n,cur*2);
    }
    public boolean isPowerOfTwo(int n) {
        return solve(n,1);
    }
}