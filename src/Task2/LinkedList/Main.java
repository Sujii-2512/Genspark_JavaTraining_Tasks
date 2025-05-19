package Task2.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addNodeAtEnd(2);
        myList.addNodeAtEnd(5);
        myList.addNodeAtEnd(10);
        myList.addNodeAtEnd(15);
        myList.addNodeAtEnd(18);
        myList.addNodeAtEnd(20);

        System.out.println("Initial List:");
        myList.printLinkedList();

        System.out.println("\nTotal nodes: " + myList.getNodeCount());

        myList.deleteLastNode();
        System.out.println("\nAfter deleting last node:");
        myList.printLinkedList();

        myList.deleteNodeAtPosition(3);
        System.out.println("\nAfter deleting node at position 3:");
        myList.printLinkedList();

        myList.deleteMiddleNode();
        System.out.println("\nAfter deleting middle node:");
        myList.printLinkedList();
    }
}