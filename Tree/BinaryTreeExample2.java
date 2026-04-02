package Tree;


public class BinaryTreeExample2 {

   static class Node{

      int data;
      Node left, right;
      Node(int data){
         this.data=data;
         left=right=null;
      }

      public void traverseInOrder(){
         if(this.left!=null){
            this.left.traverseInOrder();
         }
         System.out.println(this.data);
         if(this.right!=null){
            this.right.traverseInOrder();
         }
      }

      public void traversePreOrder(){
         System.out.println(this.data);
         if(this.left!=null){
            this.left.traversePreOrder();
         }
         if(this.right!=null){
            this.right.traversePreOrder();
         }

      }

      public void traversePostOrder(){
         if(this.left!=null){
            this.left.traversePostOrder();
         }
         if(this.right!=null){
            this.right.traversePostOrder();
         }
         System.out.print(this.data);
      }

      
   }
   static class BinaryTree{
      Node root;
      BinaryTree(){
         root=null;
      }
      BinaryTree(int data){
         root= new Node(data);
      }
      public void insert(int data){

         Node newNode= new Node(data);
         if(root==null){
            root=newNode;
         }
         Node current=root;
         Node parent=null;

         while(true){
            parent=current;
            if(data<current.data){
               current=current.left;
               if(current==null){
                  parent.left=newNode;
                  return;
               }
            }else{
               current=current.right;
               if(current==null){
                  parent.right=newNode;
                  return;
               }
            }
         }


      }

   public boolean find(int data){
      Node current=root;
      while(current!=null){
         if (current.data==data){
            return true;

         }else if(current.data>data){
            current=current.left;
         }else{
            current=current.right;
         }

      }return false;
   }

    public boolean delete(int data){
      Node parent=root;
      Node current=null;

      boolean isLeftChlid = false;
      while(current.data!=data && current!=null){
         parent=current;
         if(current.data>data){
            isLeftChlid=true;
            current=current.left;
            

         }
         else{
            isLeftChlid=false;
            current=current.right;
            
         }

         if(current==null){
            return false;
         }
      }
         if(current.left==null && current.right==null){
            if(current==root){
               root=null;
            }
         
            if(isLeftChlid==true){
               parent.left=null;
            }
            else{
               parent.right=null;
            }
         
      
         //if methods continue this
         }else if(current.right==null){

            if(current==root){
               root=current.left;
            }
            if(isLeftChlid=true){
            parent.left=current.left;
            }
            else{
               parent.right=current.left;
            }   
         }
         else if (current.left==null){
            if (current==root){
               root=current.right;
            }
            if(isLeftChlid=true){
               parent.left=current.right;
            }
            else{  
            parent.right=current.right;
            }
         }
         else if (current.left!=null&& current.right!=null){

            
            Node successor=current.right;
            Node successorParent=current;
            while(successor.left!=null){//find successor
               successorParent=successor;
               successor=successor.left;
            }


            if(successorParent!=current){
               successorParent.left=successor.right;
               successor.right=current.right;
            }
            successor.left=current.left;

            if(current==root){
               root=successor;
            }
            else if(isLeftChlid=true){
              
               parent.left=successor;}
               else{
                  parent.right=successor;
               }
            }

         
      
      
      return true;
      


   }


   }
   public void display(Node currNode){
      while(currNode!=null){
         display(currNode.left);
         System.out.println(currNode.data);
         display(currNode.right);
      }

   }
  

   

   public static void main(String[]args){
      BinaryTree tree= new BinaryTree();
      tree.root=new Node(10);
      tree.root.left=new Node(5);
      tree.root.right= new Node(12);
      tree.root.left.left=new Node(4);

   }
   
}
