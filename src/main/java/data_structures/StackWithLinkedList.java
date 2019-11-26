package data_structures;

class NodeA {
    private int data;
    private NodeA next;  // variabila de tip Node!!!

    public NodeA(int data) {
        this.data = data;
    }

    public void setNext(NodeA next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public NodeA getNext() {
        return next;
    }
}

class LinkedListA {
    private NodeA head;

    // insert element in front
    public void insertFront(int data) {
        NodeA nodeToBeInserted = new NodeA(data);
        nodeToBeInserted.setNext(head);
        head = nodeToBeInserted;
//        System.out.print(nodeToBeInserted.getData() + " ");
    }

    // insert element at the end
    public void insertLast(int data) {
        NodeA nodeToBeInserted = new NodeA(data);
        if(head == null) {
            head = nodeToBeInserted;
        } else {
            NodeA lastNode = head;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(nodeToBeInserted);
        }
//        System.out.print(nodeToBeInserted.getData() + " ");
    }

    // print list
    public void printLinkedList() {
        NodeA currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }

    // delete node
    public void delete(int data) {
        NodeA currentNode = head;
        NodeA prevNode = null;

        // Case 1 - delete the head
        if(currentNode != null && currentNode.getData() == data) {
            head = currentNode.getNext();
        }

        // Case 2 - other
        while(currentNode != null && currentNode.getData() != data) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if(currentNode != null && prevNode != null) {
            prevNode.setNext(currentNode.getNext());
        }

        // conditii multiple... merge si cu conditii simple???
        // nu se poate comasa totul in while???
        // daca head = "data" si mai avem un nod = "data" de ce nu intra in while loop???
    }

    // return last element ---------------- nu stiu daca functioneaza corect
    public NodeA returnLast() {
        if(head == null) {
            System.out.println("Empty. Nothing to return");
            return null;
        } else {
            NodeA last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            return last;
        }
    }
}

public class StackWithLinkedList {

    private LinkedListA stack;
    private NodeA top;

    // constructor to initialize stack
    StackWithLinkedList() {
        stack = new LinkedListA();
    }

    // push
    public void push(int x) {
        stack.insertLast(x);
        System.out.println("Inserting " + x);
    }

    // pop
    public int pop() {
        if (stack.returnLast() != null) {
            System.out.println("Removing " + stack.returnLast().getData());
            top = stack.returnLast();
            stack.delete(top.getData());
            if (stack.returnLast() != null) {
                return stack.returnLast().getData();
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    // print stack
    public void printStack() {
        stack.printLinkedList();
        System.out.println();
    }
}
