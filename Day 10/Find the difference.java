class Solution {
    public char findTheDifference(String s, String t) {
        int [] arr1=new int[26];
        int [] arr2=new int[26];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-'a']=arr1[s.charAt(i)-'a']+1;
            arr2[t.charAt(i)-'a']=arr2[t.charAt(i)-'a']+1;
        }
        arr2[t.charAt(s.length())-'a']=arr2[t.charAt(s.length())-'a']+1;
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return((char)(i+'a'));
            }
        }
        return 'a';
    }
}