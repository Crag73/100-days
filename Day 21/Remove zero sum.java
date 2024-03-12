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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        Map<Integer, ListNode> mp = new HashMap<>();
        int sum = 0;
        while (temp != null) {
            sum += temp.val;
            if (mp.containsKey(sum)) {
                temp = mp.get(sum).next;
                int key = sum + temp.val;
                while (key != sum) {
                    mp.remove(key);
                    temp = temp.next;
                    key += temp.val;
                }
                mp.get(sum).next = temp.next;
            } else {
                mp.put(sum, temp);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}