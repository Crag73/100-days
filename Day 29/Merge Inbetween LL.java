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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy1=new ListNode(0);
        dummy1.next=list1;
        int index=0;
        while(index!=a){
            dummy1=dummy1.next;
            index++;
        }
        ListNode temp1=new ListNode(0);
        temp1.next=dummy1;
        temp1=temp1.next;
        while(index!=b+2){
            if(temp1==null || temp1.next==null){
                break;
            }
            temp1=temp1.next;
            index++;
        }
        dummy1.next=list2;
        while(dummy1.next!=null){
            dummy1=dummy1.next;
        }
        dummy1.next=temp1;
        return list1;
    }
}