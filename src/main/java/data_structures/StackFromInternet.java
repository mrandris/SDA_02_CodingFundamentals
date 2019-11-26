package data_structures;

public class StackFromInternet {
    private int arr[];
    private int top;
    private int capacity;

    // constructor to initialize stack
    StackFromInternet(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // stack size
    public int size() {
        return top+1;
    }

    // empty stack
    public Boolean isEmpty() {
        return top == -1;
    }

    // full stack
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // return top
    public int returnTop() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }
        return -1;
    }

    // push
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot store element " + x);
            System.exit(1); // ???
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! No element to pop");
            System.exit(1); // ???
        }
        System.out.println("Removing element " + returnTop());
        return arr[top--];
    }
}
