class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<n){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==st.peek()+32 || s.charAt(i)+32==st.peek()){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        return(ans.toString());
    }
}