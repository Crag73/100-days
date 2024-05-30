/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode fut=new ListNode(0);
        ListNode cur=new ListNode(0);
        ListNode prev=null;
        cur.next=head;
        cur=cur.next;
        fut.next=head;
        fut=fut.next.next;
        while(fut!=null){
            cur.next=prev;
            prev=cur;
            cur=fut;
            fut=fut.next;
        }
        cur.next=prev;
        prev=cur;
        int max=prev.val;
        Stack<Integer> st=new Stack<>();
        while(prev!=null){
            if(prev.val>=max){
                max=prev.val;
                st.add(max);
            }
            prev=prev.next;
        }
        ListNode h=new ListNode(0);
        ListNode ans=h;
        while(!st.isEmpty()){
            ans.next=new ListNode(st.pop());
            ans=ans.next;
        }
        return h.next;
    }
}