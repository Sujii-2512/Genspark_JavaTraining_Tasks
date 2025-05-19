package Task5;

public class Stack {
    private ListNode top;

    public void push(int value) {
        ListNode newNode = new ListNode(value, top);
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        int value = top.getData();
        top = top.getNext();
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        ListNode current = top;
        System.out.print("Stack - top to bottom: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
