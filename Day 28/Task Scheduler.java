class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] arr=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<tasks.length;i++){
            arr[tasks[i]-'A']++;
        }
        Arrays.sort(arr);
        int max=arr[25]-1;
        int idle=max*n;
        for(int i=24;i>=0 && arr[i]>0;i--){
            idle-=Math.min(max,arr[i]);
        }
        if(idle>0){
            return idle+tasks.length;
        }
        else{
            return tasks.length;
        }
    }
}