class Solution {
    public static void solve(int index,String digits,String cur,String[] map,List<String> ans){
        if(index==digits.length()){
            if(cur.length()==digits.length() && cur.length()!=0)
            ans.add(cur);
        return;
        }
        int cur_digit=digits.charAt(index)-'0';
        for(int i=0;i<map[cur_digit].length();i++){
            solve(index+1,digits,cur,map,ans);
            solve(index+1,digits,cur+map[cur_digit].charAt(i),map,ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
         String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         String cur="";
         solve(0,digits,cur,map,ans);
         return ans;
    }
}