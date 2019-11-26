package data_structures;

public class Stack {
    private int[] stack;
    private int capacity;
    private int top = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
    }

    public void push(int i) {
        if (top < capacity) {
            stack[top] = i;
            System.out.println("Element pushed: " + stack[top]);
            top++;
        } else {
            overflow();
        }
    }

    public int peek() {
        if (top < 1) {
            underflow();
            return 0;
        } else {
            System.out.println("Element peeked: " + stack[top-1]);
            return stack[top-1];
        }
    }

    public int pop() {
        if (top < 1) {
            underflow();
            return 0;
        } else {
            System.out.println("Element popped: " + stack[top-1]);
            top--;
            return stack[top];
        }
    }

    public void overflow() {
        System.out.println("Stack overflow. Cannot push element.");
    }

    public void underflow() {
        System.out.println("Stack underflow. Cannot pop/peek element.");
    }
}
