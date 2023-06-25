public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow. Cannot push " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot perform pop operation.");
            return -1;
        } else {
            int poppedValue = stackArray[top];
            top--;
            return poppedValue;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Get the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();  // Stack: 10 20 30
        System.out.println("Popped: " + stack.pop());  // Popped: 30
        System.out.println("Top element: " + stack.peek());  // Top element: 20
        System.out.println("Stack size: " + stack.size());  // Stack size: 2
        stack.printStack();  // Stack: 10 20
    }
}
