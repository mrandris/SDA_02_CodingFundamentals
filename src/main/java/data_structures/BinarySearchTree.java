package data_structures;

class Node2 {
    private int data;
    private Node2 parent;
    private Node2 left;
    private Node2 right;

    public Node2(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getLeft() {
        return left;
    }

    public void setLeft(Node2 left) {
        this.left = left;
    }

    public Node2 getRight() {
        return right;
    }

    public void setRight(Node2 right) {
        this.right = right;
    }
}

public class BinarySearchTree {
    private Node2 root;

    /***** insert *****/
    public void insertNode(int data) {
        root = insert(root, data);
        System.out.println("Node with value '" + data + "' inserted");
    }

    private Node2 insert(Node2 current, int data) {
        if(current == null) {
            return new Node2(data);
        }
        if(data > current.getData()) {
            Node2 insertRight = insert(current.getRight(), data);
            current.setRight(insertRight);
        }
        if(data < current.getData()) {
            Node2 insertLeft = insert(current.getLeft(), data);
            current.setLeft(insertLeft);
        }
        return current;
    }

    /***** delete *****/
    public void deleteNode(int data) {
        root = delete(root, data);
        System.out.println("Node with value '" + data + "' deleted");
    }

    private Node2 delete(Node2 current, int data) {
        if(current == null) {
            return null;
        }

        if(data == current.getData()) {
            // no child nodes
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            // one child
            if(current.getLeft() == null) {
                return current.getRight();
            }
            if(current.getRight() == null) {
                return current.getLeft();
            }
            // two children
            int smallest = getSmallest(current.getRight());
            current.setData(smallest);
            Node2 rightNode = delete(current.getRight(), smallest);
            current.setRight(rightNode);
            return current;
        }

        if(data < current.getData()) {
            Node2 leftNode = delete(current.getLeft(), data);
            current.setLeft(leftNode);
        } else {
            Node2 rightNode = delete(current.getRight(), data);
            current.setRight(rightNode);
        }
        return current;
    }

    /***** search *****/
    public Boolean iterativeSearch(int data){
        Node2 current = root;
        while(current != null) {
            if(data < current.getData()) {
                current = current.getLeft();
            } else if(data > current.getData()) {
                current = current.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    public Boolean search(int data) {
        return isNodePresent(root, data);
    }

    private Boolean isNodePresent(Node2 current, int data) {
        if(current == null) {
            return false;
        }
        if(data == current.getData()) {
            return true;
        }
        if(data < current.getData()) {
            return isNodePresent(current.getLeft(), data);
        } else {
            // if data > current.getData()
            return isNodePresent(current.getRight(), data);
        }
    }

    /***** traverses *****/

    /***** breadth-first traverse *****/
    public void traverseBreadthFirst() {
        System.out.println("Breadth-first traverse: ");
        for(int i = 1; i <= height(root); i++) {
            printLevel(root, i);
        }
        System.out.println();
    }

    private int height(Node2 current) {
        if(current == null) {
            return 0;
        } else {
            int left = height(current.getLeft());
            int right = height(current.getRight());
            return left > right ? left+1 : right+1;
        }
    }

    private void printLevel(Node2 current, int level) {
        if(current == null) {
            return;
        }
        if(level == 1) {
            System.out.print(current.getData() + " ");
        } else if(level > 1) {
            printLevel(current.getLeft(), level - 1);
            printLevel(current.getRight(), level - 1);
        }
    }

    /***** depth-first traverses *****/
    public void traverseInOrder() {
        System.out.println("In-order traverse: ");
        traverseInOrderRecursive(root);
        System.out.println();
    }

    private void traverseInOrderRecursive(Node2 current) {
        if(current != null) {
            traverseInOrderRecursive(current.getLeft());
            System.out.print(current.getData() + " ");
            traverseInOrderRecursive(current.getRight());
        }
    }

    public void traversePreOrder() {
        System.out.println("Pre-order traverse: ");
        traversePreOrderRecursive(root);
        System.out.println();
    }

    private void traversePreOrderRecursive(Node2 current) {
        if(current != null) {
            System.out.print(current.getData() + " ");
            traverseInOrderRecursive(current.getLeft());
            traverseInOrderRecursive(current.getRight());
        }
    }

    public void traversePostOrder() {
        System.out.println("Post-order traverse: ");
        traversePostOrderRecursive(root);
        System.out.println();
    }

    private void traversePostOrderRecursive(Node2 current) {
        if(current != null) {
            traverseInOrderRecursive(current.getLeft());
            traverseInOrderRecursive(current.getRight());
            System.out.print(current.getData() + " ");
        }
    }

    /***** get size *****/
    public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(Node2 current) {
        if(current == null) {
            return 0;
        } else {
            return getSizeRecursive(current.getLeft()) + 1 + getSizeRecursive(current.getRight());
        }
        // or with conditional operator:
        // return current == null ? 0 : getSizeRecursive(current.getLeft()) + 1 + getSizeRecursive(current.getRight());
    }

    // aid method for delete function to find smallest or highest value
    private int getSmallest(Node2 node) /* recursive */ {
        if(node.getLeft() == null) {
            return node.getData();
        } else {
            return getSmallest(node.getLeft());
        }
    }

    public int getSmallestValue() {
        Node2 current = root;
        while(current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getData();
    }

    public int getHighestValue() {
        Node2 current = root;
        while(current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }
}
