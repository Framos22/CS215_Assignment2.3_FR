import java.util.Scanner;

/**
 * Application class simulating a queue at VegeBurger Palace.
 */
public class App {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);

        // Enqueue Bill, Alice, and Bob
        System.out.println("Bill, Alice, and Bob are in line.");
        queue.enqueue("Bill");
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.printQueue();

        // Serve a customer
        System.out.println("\nA customer is served: " + queue.dequeue());
        queue.printQueue();

        // Jane arrives
        System.out.println("\nJane arrives.");
        queue.enqueue("Jane");
        queue.printQueue();

        // Hamad arrives
        System.out.println("\nHamad arrives.");
        queue.enqueue("Hamad");
        queue.printQueue();

        // Two customers are served
        System.out.println("\nA customer is served: " + queue.dequeue());
        queue.printQueue();
        System.out.println("\nA customer is served: " + queue.dequeue());
        queue.printQueue();

        // Jim arrives
        System.out.println("\nJim arrives.");
        queue.enqueue("Jim");
        queue.printQueue();

        // Serve another customer
        System.out.println("\nA customer is served: " + queue.dequeue());
        queue.printQueue();

        // Serve another customer
        System.out.println("\nAnother customer is served: " + queue.dequeue());
        queue.printQueue();

        scanner.close();
    }
}
