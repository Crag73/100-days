class Solution {
    public String customSortString(String order, String s) {
        int n=s.length();
        String ans="";
        Map<Character,Integer> st= new HashMap<>();
        for(int i=0;i<n;i++){
            st.put(s.charAt(i),st.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<order.length();i++){
            if(st.containsKey(order.charAt(i))){
                int temp=st.get(order.charAt(i));
                while(temp-->0){
                    ans+=order.charAt(i);
                }
            }
            st.remove(order.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(st.containsKey(s.charAt(i))){
                int temp=st.get(s.charAt(i));
                while(temp-->0){
                    ans+=s.charAt(i);
                }
            }
             st.remove(s.charAt(i));
        }
        return ans;
    }
}