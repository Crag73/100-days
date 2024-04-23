class Mine{
    String lock;
    int turns;
    public Mine(String lock, int turns) {
        this.lock=lock;
        this.turns=turns;
    }
}

class Solution {
    public String[] children(String lock){
        List<String> children = new ArrayList<>();
        for (int i=0;i<4;i++) {
            char[] chars=lock.toCharArray();
            chars[i]=(char)(((chars[i]-'0'+1) %10)+'0');
            children.add(new String(chars));
            chars[i]=lock.charAt(i);
            chars[i]=(char)(((chars[i]-'0'+9)%10)+'0');
            children.add(new String(chars));
        }
        return children.toArray(new String[0]);
    }
    public int openLock(String[] deadends, String target) {
        Set<String> st=new HashSet<>();
        for(String deadend:deadends){
            if(deadend.equals("0000")){
                return -1;
            }
            st.add(deadend);
        }
        Queue<Mine> q=new LinkedList<>();
        Mine m=new Mine("0000",0);
        q.add(m);
        while(!q.isEmpty()){
            String lock=q.peek().lock;
            int turns=q.peek().turns;
            q.remove();
            if(lock.equals(target)){
                return turns;
            }
            for(String child:children(lock)){
                if(!st.contains(child)){
                    st.add(child);
                    Mine x=new Mine(child,turns+1);
                    q.add(x);
                }
            }
        }
        return -1;
    }
}