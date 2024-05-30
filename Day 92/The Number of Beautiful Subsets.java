class Solution {
    public int solve(int[] arr,int k,int index,Map<Integer,Integer> map){
        if(index==arr.length){
            return 1;
        }
        int no=solve(arr,k,index+1,map);
        int yes=0;
        int cur=arr[index];
        if(map.getOrDefault(cur-k,0)==0 && map.getOrDefault(cur+k,0)==0){
            map.put(cur,map.getOrDefault(cur,0)+1);
            yes=solve(arr,k,index+1,map);
            map.put(cur,map.get(cur)-1);
            if(map.get(cur)==0){
                map.remove(cur);
            }
        }
        return yes+no;
    }
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        return solve(nums,k,0,map)-1;
    }
}