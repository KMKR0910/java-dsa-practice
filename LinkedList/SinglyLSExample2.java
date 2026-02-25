package LinkedList;//LinkedList Start From End

public class SinglyLSExample2 {


  static Node head;
  static class Node{
  int data;
  Node next;
  Node(int d,Node n){
   data=d;
   next=n;
  }}

  public static void main (String[]args){
   Node temp = new Node(3,null);
   temp = new Node(2,temp);
   head=new Node(1,temp);
   display(head);

  }

  static void display(Node currNode){
   while(currNode!=null){
      System.out.println("Value"+currNode.data);
      currNode=currNode.next;
   }
  }
  



   
   
}
