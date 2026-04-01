package Queue;



import java.util.NoSuchElementException;

public class QueueExample1 {
    
    static Node front;
    static Node rear;
    static int size = 0;  // Track size for better performance
    
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        
        // Test add() method
        System.out.println("=== Testing add() ===");
        System.out.println("Added 10: " + add(10));
        System.out.println("Added 20: " + add(20));
        System.out.println("Added 30: " + add(30));
        display();
        
        // Test element() method
        System.out.println("\n=== Testing element() ===");
        System.out.println("Head element: " + element());
        
        // Test remove() method
        System.out.println("\n=== Testing remove() ===");
        System.out.println("Removed: " + remove());
        System.out.println("Removed: " + remove());
        display();
        
        // Test peek() method
        System.out.println("\n=== Testing peek() ===");
        System.out.println("Peek (should show 30): " + peek());
        
        // Test poll() method
        System.out.println("\n=== Testing poll() ===");
        System.out.println("Poll: " + poll());
        System.out.println("Poll (queue empty): " + poll());
        
        // Test exception cases
        System.out.println("\n=== Testing Exception Cases ===");
        try {
            System.out.println("Calling remove() on empty queue:");
            remove();  // This will throw exception
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try {
            System.out.println("\nCalling element() on empty queue:");
            element();  // This will throw exception
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Test add after empty
        System.out.println("\n=== Testing add() after empty ===");
        System.out.println("Added 100: " + add(100));
        display();
        System.out.println("Queue size: " + size());
    }
    
    // ========== Standard Queue Methods ==========
    
    /**
     * Adds element to queue (matches Java's add() method)
     * @return true if successful
     * @throws IllegalStateException if queue is full (not applicable for linked list)
     */
    static boolean add(int item) {
        Node newNode = new Node(item);
        
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        
        size++;
        return true;  // Always returns true for linked list implementation
    }
    
    /**
     * Removes and returns head (matches Java's remove() method)
     * @return the head element
     * @throws NoSuchElementException if queue is empty
     */
    static int remove() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        
        int removedValue = front.data;
        
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        
        size--;
        return removedValue;
    }
    
    /**
     * Removes and returns head, or null if empty (matches Java's poll() method)
     * @return head element, or null if queue empty
     */
    static Integer poll() {
        if (front == null) {
            return null;  // Returns null, doesn't throw exception
        }
        
        int removedValue = front.data;
        
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        
        size--;
        return removedValue;
    }
    
    /**
     * Returns but doesn't remove head (matches Java's element() method)
     * @return head element
     * @throws NoSuchElementException if queue is empty
     */
    static int element() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }
    
    /**
     * Returns but doesn't remove head, or null if empty (matches Java's peek() method)
     * @return head element, or null if queue empty
     */
    static Integer peek() {
        if (front == null) {
            return null;  // Returns null, doesn't throw exception
        }
        return front.data;
    }
    
    // ========== Additional Utility Methods ==========
    
    /**
     * Returns size of queue
     */
    static int size() {
        return size;
    }
    
    /**
     * Checks if queue is empty
     */
    static boolean isEmpty() {
        return front == null;
    }
    
    /**
     * Displays all queue elements
     */
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
        System.out.println("  front points to: " + front.data);
        System.out.println("  rear points to: " + rear.data);
        System.out.println("  size: " + size);
    }
    
    /**
     * Clears the queue
     */
    static void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }



}
