/**
 * @author njohnson3
 *
 */
public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int length;

    public LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getList() {
        return head;
    }

    // Adds a node to the rear of the linked list
    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
        } else {
            tail.nextNode = aNode;
            tail = tail.nextNode;
        }
        tail.nextNode = null;
        length++;
    }

    // Removes a node from the front of the linked list
    public T removeNode() {
        if (isEmpty()) {
            return null; 
        }

        Node<T> temp = head;  // Store the node to return
        head = head.nextNode; // Move the head to the next node

        if (head == null) {
            tail = null;  
        }

        length--;
        return temp.getData();  
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;

        while (current != null) {
            result.append(current.getData()).append(" ");
            current = current.nextNode;
        }

        return result.toString();
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Node<Integer> aNode = new Node<>();
        aNode.setData(1);
        myList.addNode(aNode);
        aNode = new Node<>();
        aNode.setData(2);
        myList.addNode(aNode);

        Node<Integer> tempnode = myList.getList();
        do {
            System.out.println(tempnode.getData());
            tempnode = tempnode.nextNode;
        } while (tempnode != null);
    }
}

class Node<T> {
    private T data;
    Node<T> nextNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
