class Solution {
    public int solve(int[] arr,int i,int cur){
        if(i>=arr.length){
            return cur;
        }
        int yes=solve(arr,i+1,cur^arr[i]);
        int no=solve(arr,i+1,cur);
        return yes+no;
    }
    public int subsetXORSum(int[] arr) {
        int ans=0;
        int n=arr.length;
        if(n==0){
            return 0;
        }
        return solve(arr,0,0);
    }
}