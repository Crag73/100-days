class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int count=0;
        while(tickets[k]!=0){
            int index=q.peek();
            if(tickets[index]==0){
                q.remove();
                continue;
            }
            tickets[index]--;
            count++;
            q.remove();
            q.add(index);
        }
        return count;
    }
}