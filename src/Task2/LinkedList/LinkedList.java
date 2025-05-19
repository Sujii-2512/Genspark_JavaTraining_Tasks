package Task2.LinkedList;

public class LinkedList {
    private ListNode head;

    // add a new node at the end
    void addNodeAtEnd(int value) {
        ListNode newNode = new ListNode(value, null);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    // print all elements
    void printLinkedList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    // count total nodes
    public int getNodeCount() {
        int count = 0;
        for (ListNode temp = head; temp != null; temp = temp.getNext()) {
            count++;
        }
        return count;
    }

    // delete the last node
    void deleteLastNode() {
        if (head == null) return;

        if (head.getNext() == null) {
            head = null;
            return;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr.getNext() != null) {
            prev = curr;
            curr = curr.getNext();
        }

        prev.setNext(null);
    }

    // delete a node at position
    void deleteNodeAtPosition(int position) {
        if (position < 0 || head == null) return;

        if (position == 0) {
            head = head.getNext();
            return;
        }

        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < position; i++) {
            if (curr == null) return;
            prev = curr;
            curr = curr.getNext();
        }

        if (prev != null && curr != null) {
            prev.setNext(curr.getNext());
        }
    }

    // delete the middle node
    void deleteMiddleNode() {
        int totalNodes = getNodeCount();

        if (totalNodes <= 1) {
            head = null;
            return;
        }

        int middleIndex = totalNodes / 2;
        deleteNodeAtPosition(middleIndex);
    }
}
