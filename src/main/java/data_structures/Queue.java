package data_structures;

public class Queue {
    public char[] queue;
    private int capacity;
    private int tail;
    private char head;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new char[capacity];
        tail = capacity;
    }

    public void printQueue() {
        System.out.println("Queue: ");
        for(char i : queue) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

    public void enqueue(char element) {
        System.out.println("Inserting element: " + element);
        if(tail != 0) {
            queue[tail-1] = element;
            tail--;
            System.out.println("Element inserted");
        } else {
            System.out.println("Queue overflow. Element NOT inserted");
        }
    }

    public char dequeue() {
        head = queue[capacity-1];
        if(tail != capacity) {
            System.out.println("Removing element: " + queue[capacity-1]);
            for(int i = capacity-1; i > tail; i--) {
                queue[i] = queue[i-1];
            }
            queue[tail] = ' ';
            tail++;
            System.out.println("Head removed");
            return head;
        } else {
            System.out.println("Queue underflow. Nothing to remove");
            return ' ';
        }
    }
}
