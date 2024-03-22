/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null || head == null) {
            return true;
        }
        ListNode mid = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            mid = mid.next;
        }
        ListNode rev = mid.next;
        ListNode prev = null;
        while (rev != null) {
            ListNode temp = rev.next;
            rev.next = prev;
            prev = rev;
            rev = temp;
        }
        mid.next = prev;
        ListNode temp = mid.next;
        while (temp != null) {
            if (head.val != temp.val) {
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        return true;

    }
}