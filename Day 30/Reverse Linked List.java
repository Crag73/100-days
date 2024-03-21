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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode nex=new ListNode(0);
        ListNode cur=new ListNode(0);
        ListNode prev=new ListNode(0);
        cur.next=head;
        prev.next=head;
        nex.next=head;
        if(nex.next.next!=null){
            nex=nex.next.next;
        }
        else{
            nex=null;
        }
        prev=prev.next;
        cur=cur.next;
        cur.next=null;
        cur=nex;
        while(nex!=null){
            nex=nex.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
}