package LinkedList;

public class DoublyLSExample2 {

    static Node head;

    static class Node{
      Node next;
      Node prev;
      int data;
      Node(int d){
         data=d;
         next=null;
      }
      Node (int d,Node p, Node n){
         data=d;
         next=n;
         prev=p;
      }
    }
    public static void main(String[]args){
      head=new Node(1);
      Node second=new Node(2);
      Node third= new Node(3);

      head.next=second;
      second.prev=head;
      second.next=third;
      third.prev=second;
    }

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


   static void addFirst(int item){
      Node tmp= head;
      head= new Node(item,null,head);
      tmp.prev=head;

   }

   static void addLast(int item){
      if (head==null){
         addFirst(item);
         
      }
      else{
      Node tmp=head;
      while(tmp.next!=null){
         tmp=tmp.next;
      }
      if (tmp.next==null){
         Node newNode=new Node(item,tmp,null); /// or simply tmp.next=new Node(item,tmp,null); /// or simply tmp.next=newNode;
;
         tmp.next=newNode;
      }}
   }

   static void insertAfter(int item , int key){
      Node tmp=head;
      Node nextNode=null;
      while(tmp!=null && tmp.data!=key){
         tmp=tmp.next;
      }
      if (tmp!=null){//(tmp!null && tmp.next==null) this is idea (in last node)
         nextNode=tmp.next;
         tmp.next=new Node(item,tmp,nextNode);
      
         if (nextNode!=null){
         nextNode.prev= tmp.next;
         }
   }
}
   
   public static void insertBefore(int key, int item)
{
    Node tmp = head;

    while(tmp != null && tmp.data != key) {
        tmp = tmp.next;
    }

    if(tmp != null)
    {
        Node PrevRef = tmp.prev;

        tmp.prev = new Node(item, tmp.prev, tmp);

        if(PrevRef != null)
        {
            PrevRef.next = tmp.prev;
        }
        else
        {
            head = tmp.prev;
        }
    }
}

   
}
