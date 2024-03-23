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
    public void reorderList(ListNode head) {
        ListNode fastPointer=head,slowPointer=head;
        while(fastPointer.next!=null && fastPointer.next.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        ListNode current=slowPointer.next;
        slowPointer.next=null;
        ListNode previous=null;
        while(current!=null){
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        current=head;
        while(previous!=null){
            ListNode temp=previous.next;
            previous.next=current.next;
            current.next=previous;
            current=previous.next;
            previous=temp;
        }
    }
}
