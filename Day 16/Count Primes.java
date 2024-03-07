class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=0;i<Math.sqrt(n);i++){
            if(arr[i]==true){
                for(int j=i*i;j<arr.length;j+=i){
                    arr[j]=false;
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true){
                ans++;
            }
        }
        return ans;
    }
}