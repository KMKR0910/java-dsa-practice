package Stack;

public class LinkedlistUse { /// ypu can use Node top insted of using Node head;


   static Node head;
   static class Node{

  

   int data;
   Node next;
   Node(int d){
      this.data=d;
      this.next=null;

   }
}

public static void main(String[]args){

        push(10);
        push(20);
        push(30);

        display(head);

        peek();

        pop();
        System.out.println("After Pop:");

        display(head);
    }

static void push(int item){
   if (head==null){
      head= new Node(item);
   }
   else{
      Node newNode= new Node(item);
      newNode.next=head;
      head=newNode;
      

   }
      
   }

   static void pop(){
      if (head==null){
         return;
      }
      else if(head.next==null){
         head=null;
      }
      else{
         head=head.next;
         
      }

   }

   static int peek(){
      if(head!=null){
         return head.data;

      }else{
       return 0;
      }

   }

   static void display(Node currNode){
      while(currNode!=null){
         System.out.println("Value "+currNode.data);
         currNode=currNode.next;

      }
      if(currNode==null){
         System.out.println("List is empty");
      }
   }
}


// below method is most perfect method for stack implement using linkedlist

// package Stack;

// public class LinkedlistUse {

//     static Node head;

//     static class Node {
//         int data;
//         Node next;

//         Node(int d) {
//             this.data = d;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {

   //      push(10);
   //      push(20);
   //      push(30);

   //      display();

   //      peek();

   //      pop();
   //      System.out.println("After Pop:");

   //      display();
   //  }

//     static void push(int item) {

//         Node newNode = new Node(item);

//         if (head == null) {
//             head = newNode;
//         } 
//         else {
//             newNode.next = head;
//             head = newNode;
//         }

//         System.out.println("Pushed: " + item);
//     }

//     static void pop() {

//         if (head == null) {
//             System.out.println("Stack Underflow");
//             return;
//         }

//         int removed = head.data;
//         head = head.next;

//         System.out.println("Popped: " + removed);
//     }

//     static void peek() {

//         if (head == null) {
//             System.out.println("Stack is Empty");
//             return;
//         }

//         System.out.println("Top Element: " + head.data);
//     }

//     static void display() {

//         if (head == null) {
//             System.out.println("Stack is Empty");
//             return;
//         }

//         Node temp = head;

//         System.out.println("Stack elements:");

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }



