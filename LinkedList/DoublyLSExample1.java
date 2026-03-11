package LinkedList;

public class DoublyLSExample1 {

static Node head;
static class Node{
  
   int data;
   Node next;
   Node prev=null;


   Node (int d){
      data=d;
      next=null;
   }
   Node(int d,Node n,Node p){
      data=d;
      next=n;
      prev=p;
   }

   public static void main(String[]args){
      head =new Node(1);
      Node second= new Node(2);
      Node third = new Node(3);
      head.next=second;
      second.prev=head;
      second.next=third;
      third.prev=second;

      display(head);
      

   }
   // if you want only forward direction forward
   //static void display(Node currNode){
   //    while(currNode!=null){
   //       System.out.println("Value"+currNode.data);
   //       currNode=currNode.next;
   //    }

   // }

   static void display(Node currNode){
      Node tail= null;  //tail store value of  last node.because when end this loop currNode become null .  
      while(currNode!=null){//after become null we cant do backward direction value print
         System.out.println("Value"+currNode.data);
         tail=currNode;
         currNode=currNode.next;
      }
      currNode=tail;
      while(currNode!=null){
         System.out.println("Value"+currNode.data);
         currNode=currNode.prev;
      }
   }
 

}

   
}
