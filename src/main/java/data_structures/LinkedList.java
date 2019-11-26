package data_structures;

class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
//    private Node node;

    public Node findNode(int data) {
        Node current = head;
        while (current != null) {
            if (data == current.getData()) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void insertFront(int data) {
        Node insertedNode = new Node(data);
        insertedNode.setNext(head);
        if(head != null) {
            head.setPrev(insertedNode);
        }
        head = insertedNode;
        if(tail == null) {
            tail = insertedNode;
        }
    }

    public void insertLast(int data) {
        Node insertedNode = new Node(data);
        if(tail != null) {
            tail.setNext(insertedNode);
        }
        insertedNode.setPrev(tail);
        tail = insertedNode;
        if (head == null) {
            head = insertedNode;
        }
    }

    public void insertAfterNode(int existingData, int insertedData) {
        Node existingNode = findNode(existingData);
        if(existingNode != null) {
            if(existingNode == tail) {
                insertLast(insertedData);
            } else {
                Node insertedNode = new Node(insertedData);
                // setting up connections to next node
                existingNode.getNext().setPrev(insertedNode);
                insertedNode.setNext(existingNode.getNext());
                // setting up connections to previous node
                insertedNode.setPrev(existingNode);
                existingNode.setNext(insertedNode);
            }
        } else {
            System.out.println("Node does not exist");
        }
    }

    public void printLinkedList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.getData() + "\t");
            current = current.getNext();
        }
        System.out.println();
    }

    public void deleteNode(int data) {
        Node existingNode = findNode(data);
        if(existingNode == null) {
            System.out.println("Node does not exist");
        } else {
                // deleting the head
            if (existingNode == head) {
                existingNode.getNext().setPrev(null);
                head = existingNode.getNext();
            } else if(existingNode == tail) {
                // deleting the tail
                existingNode.getPrev().setNext(null);
                tail = existingNode.getPrev();
            } else {
                // deleting node from middle
                // setting up connections to next node
                existingNode.getNext().setPrev(existingNode.getPrev());
                existingNode.getPrev().setNext(existingNode.getNext());
            }
        }
    }
}
