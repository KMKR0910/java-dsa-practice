package Heap;

public class HeapExample1 {
   
   static class MaxHeap {



      private int[] Heap;
      private int size;
      private int maxSize;
   
   public MaxHeap(int maxSize){
      this.maxSize=maxSize;
      this.size=0;
      Heap= new int[this.maxSize+1];
      Heap[0]= Integer.MAX_VALUE;


   }

   private int parent(int pos){
      return pos/2;
   }

   private int leftChild(int pos){
      return (2*pos);
   }

   private int rightChild(int pos){
      return (2*pos)+1;
   }
   private boolean isLeaf(int pos){
      if (pos >size/2 && pos<=size){
         return true;
      }
      return false;
   }

   public void insert(int item){
      
      
      
      Heap[++size]=item;
      int current=size;

      while(Heap[current]>Heap[parent(current)]){
         swap(current,parent(current));
         current  =parent(current);
      }





   }
   public void swap(int fpos,int spos){

      int tmp;
      tmp=Heap[fpos];
      Heap[fpos]=Heap[spos];
      Heap[spos]=tmp;
   }

   public int deleteRoot(){
      int root=Heap[1];
      int current=size;
      Heap[1]=Heap[current];
      size--;
      Heapify(1);
      return root;

   }

   public void Heapify(int pos){
      
      if(!isLeaf(pos)){
         return;}  

         if (Heap[pos]<Heap[leftChild(pos)] || Heap[pos]<Heap[rightChild(pos)]){
            if (Heap[leftChild(pos)]>Heap[rightChild(pos)]){   ///for max heap swap with largest child 
               swap(pos, leftChild(pos));   
               Heapify(leftChild(pos));
            }  
            else{
               swap(pos, rightChild(pos));
               Heapify(rightChild(pos));
            }


         }
      }
      
   }

}

public static void main(String[]args){
   System.out.println("The Max Heap is ");
   MaxHeap maxHeap= new MaxHeap(15);
   maxHeap.insert(5);
   maxHeap.insert(6);


}
}