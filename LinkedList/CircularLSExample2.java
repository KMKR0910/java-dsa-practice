package LinkedList;

public class CircularLSExample2 {
   static class Node{
      int data;
      Node next;

      Node(int d){
         this.data=d;
         this.next=null;
      }
      }
      static class CircularLS{
         static int size=0;
         static Node head=null;
         static Node tail=null;

         public void addNodeAtStart(int data){
           Node newNode=new Node(data);
           if(size==0){
            head=newNode;
            tail=newNode;
            newNode.next=head;
           }else{
            newNode.next=head;
            head=newNode;
           
            tail.next=head;
            
         }size++;

         }
         public void addNodeAtEnd(int data){

            Node newNode=new Node(data);
            if (size==0){
               head=newNode;//or addNodeAtStart(data);
               tail=newNode;
               newNode.next=head;
            }else{
              tail.next=newNode;
              tail=newNode;
              tail.next=head;
              size++;


               }
               System.out.println("New value "+data);
               


            }

         
   
         public void deleteAtStart(){
            if(size==0){
               return;
            }
            else if(size==1){

               head=null;
               tail=null;
               size--;
            }
            else{
               tail.next=head.next;
               head=head.next;
               size--;
            }

            }

         public void deleteAtEnd(){
            if(size==0){
               return;
               
            }
            else if(size==1){
               deleteAtStart();
            }
            else{
               Node tmp=head;
               while(tmp.next!=tail){
                  tmp=tmp.next;
               }
              tail=tmp;
              tail.next=head;
              size--;

            }


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
      
   }



   
   

