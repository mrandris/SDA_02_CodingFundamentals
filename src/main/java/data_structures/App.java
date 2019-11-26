package data_structures;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Stacks

/*        Stack stack = new Stack(3);

        stack.push(16);
        stack.push(24);
        stack.push(32);
        stack.push(48);

        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();*/

        // Queues

/*        Queue queue = new Queue(5);

        queue.printQueue();
        queue.enqueue('a');
        queue.printQueue();

        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        queue.enqueue('f');

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();*/

        // LinkedLists

/*        LinkedList linkedList = new LinkedList();

        linkedList.insertLast(5);
        linkedList.insertFront(4);
        linkedList.insertFront(2);
        linkedList.insertFront(1);
        linkedList.insertLast(6);
        linkedList.insertAfterNode(2,3);
        linkedList.insertAfterNode(45,3);

        linkedList.printLinkedList();

        linkedList.deleteNode(2);
        linkedList.deleteNode(1);
        linkedList.deleteNode(6);
        linkedList.printLinkedList();

        linkedList.insertFront(0);
        linkedList.insertLast(64);
        linkedList.insertAfterNode(4,56);
        linkedList.insertAfterNode(64,77);

        linkedList.printLinkedList();*/

        // Binary search Tree

        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(6);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(2);
        tree.insertNode(5);
        tree.insertNode(9);
        tree.insertNode(8);

        System.out.println(tree.iterativeSearch(6));
        System.out.println(tree.iterativeSearch(3));
        System.out.println(tree.iterativeSearch(2)); // false

        System.out.println(tree.iterativeSearch(7));
        System.out.println(tree.iterativeSearch(5));

        System.out.println(tree.iterativeSearch(9)); // false
        System.out.println(tree.iterativeSearch(8)); // false

        System.out.println(tree.iterativeSearch(46));

        System.out.println("Tree size: " + tree.getSize());
        System.out.println("Smallest value: " + tree.getSmallestValue());
        System.out.println("Highest value: " + tree.getHighestValue());

        tree.traverseInOrder();
        tree.traverseBreadthFirst();

    }
}
