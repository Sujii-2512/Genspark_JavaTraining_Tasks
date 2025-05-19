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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lead = head;
        ListNode follow = head;

        // Move lead pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (lead == null) return head;  // n is larger than list length, just return head
            lead = lead.next;
        }

        // If lead is null after moving n steps remove head
        if (lead == null) {
            return head.next;
        }

        // Move both pointers until lead reaches the last node
        while (lead.next != null) {
            lead = lead.next;
            follow = follow.next;
        }

        follow.next = follow.next.next;

        return head; 
    }
}
