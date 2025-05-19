package Task5;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.printStack();

        System.out.println("Is stack empty? " + stack.isEmpty());
        //popping other two elements
        stack.pop();
        stack.pop();
        //after popping two elements
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop(); //underflow
    }
}
