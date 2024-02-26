import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {

    public static void solve(int index,String cur,String str,ArrayList<String> ans){
        if(index>=str.length()){
            if(cur.length()>0)
            ans.add(cur);
            return;
        }
        solve(index+1,cur,str,ans);
        solve(index+1,cur+str.charAt(index),str,ans);
    }
    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans=new ArrayList<>();
        String cur="";
        solve(0,cur,str,ans);
        return ans;
    }
}