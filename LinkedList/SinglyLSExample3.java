package LinkedList;

public class SinglyLSExample3 {

   static Node head;

   static class Node{
      int data;
      Node next;
      Node (int d)
      {
       data =d;
       next=null;
      }
      Node (int d,Node n)
      {
       data =d;
       next=n;
      }

   }
   public static void main(String[] args){
      head= new Node(1);
      Node second= new Node(2);
      Node third= new Node(3);

      head.next=second;
      second.next=third;
      addFirst(4);
     // Display(head);
      addLast(5);
     // Display(head);
      instertAfter(6, 7);
     // Display(head);
      insertBefore(7, 3);
     // Display(head);
      remove(4);
    // Display(head);
     getFirst();
     getLast();
     Display(head);

     


   }

   static void Display(Node currNode){
      while (currNode!=null){
         System.out.println("Value  "+currNode.data);
         currNode=currNode.next;
      }
         
      }
      public static void addFirst(int item){
         head= new Node(item,head);
         
      }

      public static void addLast(int item){
         if (head==null){
            head= new Node(item,head);
         }
         Node tmp= head;
         while(tmp.next!=null){
            tmp=tmp.next;
            
         }
          tmp.next=new Node(item,null);
      }
      public static void instertAfter(int item,int key){
         Node tmp=head;
         while(tmp!=null && tmp.data!=key){
            tmp=tmp.next;
         }
         if(tmp!=null){
         tmp.next=new Node(item,tmp.next);}
      }

      public static void insertBefore(int item,int key){
         Node tmp=head;
         Node prev=null;
         while(tmp!=null && tmp.data!=key){
            prev=tmp;
            tmp=tmp.next;
           

         } 
         if(tmp!=null && prev==null ){
            head = new Node(item,head);
         }
         if(tmp!=null){
         prev.next=new Node(item,tmp);}
         
      }

      public static void remove(int key){
         if (head==null){
            return;
         }
         Node tmp=head;
         Node prev=null;
         

         while(tmp!=null && tmp.data!=key){
            prev=tmp;
            tmp=tmp.next;
         }
         if (tmp!=null && prev==null){
            head=head.next;

         }
        else if(tmp!=null){
            prev.next=tmp.next;

         }
         
      }
      public static int getLast(){

         if(head==null){
            throw new RuntimeException("null");
         }
       
         Node tmp=head;
         while(tmp.next!=null){
            tmp=tmp.next;
         }
        return tmp.data;
      }

      public static int getFirst(){
         if (head==null){
            throw new RuntimeException("null");
         }
         return head.data;
      }


   }
   

