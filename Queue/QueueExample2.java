package Queue;



public class QueueExample2 {
    
    static Node front;  // Head of queue - where elements are removed from
    static Node rear;   // Tail of queue - where elements are added to
    
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        
        enqueue(10);
        enqueue(20);
        enqueue(30);
        
        System.out.println("Initial Queue:");
        display();
        
        System.out.println("\nFront Element: " + peek());
        
        dequeue();
        System.out.println("\nAfter Dequeue:");
        display();
        
        dequeue();
        System.out.println("\nAfter Another Dequeue:");
        display();
        
        enqueue(40);
        enqueue(50);
        System.out.println("\nAfter Enqueue 40 and 50:");
        display();
        
        System.out.println("\nQueue Size: " + size());
    }
    
    // Add element to the rear of queue
    static void enqueue(int item) {
        Node newNode = new Node(item);
        
        if (front == null) {  // Queue is empty
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;  // Link new node at the end
            rear = newNode;        // Update rear pointer
        }
        
        System.out.println("Enqueued: " + item);
    }
    
    // Remove element from the front of queue
    static int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow - Cannot dequeue");
            return -1;
        }
        
        int removedValue = front.data;
        
        if (front == rear) {  // Only one element
            front = null;
            rear = null;
        } else {
            front = front.next;  // Move front to next element
        }
        
        System.out.println("Dequeued: " + removedValue);
        return removedValue;
    }
    
    // View front element without removing
    static int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        
        return front.data;
    }
    
    // Display all queue elements
    static void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        
        Node currNode = front;
        System.out.print("Queue (front → rear): ");
        
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print(" → ");
            }
            currNode = currNode.next;
        }
        System.out.println();
    }
    
    // Get size of queue
    static int size() {
        int count = 0;
        Node currNode = front;
        
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        
        return count;
    }
    
    // Check if queue is empty
    static boolean isEmpty() {
        return front == null;
    }
    
    // Clear the queue
    static void clear() {
        front = null;
        rear = null;
        System.out.println("Queue cleared");
    }
} 


