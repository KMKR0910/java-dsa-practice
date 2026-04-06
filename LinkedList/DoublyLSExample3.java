package LinkedList;
///delete from head, delete from last, delete any node by value

public class DoublyLSExample3 {

    public class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

    Node head;

    // Insert at end (for testing)
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete from head
    public void deleteFromHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from last
    public void deleteFromLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // If only one node
        if (temp.next == null) {
            head = null;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Delete any node by value
    public void deleteByValue(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // Find the node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If not found
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // If node is head
        if (temp == head) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // If node is last
        if (temp.next == null) {
            temp.prev.next = null;
            return;
        }

        // Node is in middle
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.deleteFromHead();
        System.out.println("After deleting head:");
        list.display();

        list.deleteFromLast();
        System.out.println("After deleting last:");
        list.display();

        list.deleteByValue(20);
        System.out.println("After deleting value 20:");
        list.display();
    }
} {
   
}
