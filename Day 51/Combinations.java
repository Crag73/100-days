class Solution {
    public void solve(int n,int k,int index,List<Integer> cur,List<List<Integer>> ans){
        if(cur.size()==k){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=index+1;i<=n;i++){
            cur.add(i);
            solve(n,k,i,cur,ans);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        solve(n,k,0,cur,ans);
        return ans;
    }
}