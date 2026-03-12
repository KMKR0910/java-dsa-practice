package LinkedList;

class CircularLSExample1 {

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
      head= new Node(1);
      Node second= new Node(2);
      Node third= new Node(3);
      head.next=second;
      second.next=third;
      third.next=head;
      display(head);
   }


   static void display(Node currNode){
      Node temp=currNode;
      if(temp!=null){
         do{
            System.out.println("Value "+temp.data);
            temp=temp.next;
         }while(temp!=head);


      }
   }
}