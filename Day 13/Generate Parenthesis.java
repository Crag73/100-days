class Solution {
    public void solve(int n,String cur,List<String> ans,int left,int right){
        if(right>left){
            return;
        }
        if(cur.length()==n*2){
            if(left==right && cur.charAt(n*2-1)==')')
                ans.add(cur);
            return;
        }
        solve(n,cur+"(",ans,left+1,right);
        solve(n,cur+")",ans,left,right+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String cur="(";
        solve(n,cur,ans,1,0);
        return ans;
    }
}