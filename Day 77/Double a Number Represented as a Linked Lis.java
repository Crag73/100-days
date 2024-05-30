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
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current!= null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head = prev;
        int carry=0;
        Stack<Integer> st=new Stack<>();
        while(head!=null){
            int doubled=head.val*2+carry;
            st.push(doubled%10);
            carry=doubled/10;
            head=head.next;
        }
        if(carry!=0){
            st.add(carry);
        }
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(!st.isEmpty()){
            dummy.next=new ListNode(st.pop());
            dummy=dummy.next;
        }
        return ans.next;
    }
}