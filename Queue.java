/**
 * Queue class that uses LinkedList to enqueue and dequeue.
 */
public class Queue<T> {
    private LinkedList<T> list;

    // Constructor initializes the linked list
    public Queue() {
        list = new LinkedList<>();
    }

    /**
     * Enqueues an item by adding it to the rear of the queue.
     * @param item The item to be enqueued.
     */
    public void enqueue(T item) {
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        list.addNode(newNode);  // Add the node to the LinkedList
    }

    /**
     * Dequeues an item by removing it from the front of the queue.
     * @return The item that was dequeued.
     */
    public T dequeue() {
        return list.removeNode();  // Remove the node from the LinkedList
    }

    /**
     * Prints the current state of the queue.
     */
    public void printQueue() {
        if (list.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Queue: " + list);
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
