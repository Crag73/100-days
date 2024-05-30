class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(Integer.toString(a+b));
            }
            else if(s.equals("-")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(Integer.toString(b-a));
            }
            else if(s.equals("*")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(Integer.toString(a*b));
            }
            else if(s.equals("/")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                st.push(Integer.toString(b/a));
            }
            else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.pop());
    }
}