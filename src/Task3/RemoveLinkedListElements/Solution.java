class Solution {
  public ListNode removeElements(ListNode head, int val) {
         // Handle the case when the list is empty
        if (head == null) return null;

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                if (previous == null) {
                    // Removing the head node
                    head = current.next;
                    current = head;
                } else {
                    previous.next = current.next;
                    current = current.next;
                }
            } else {
                // Move both pointers forward
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}
