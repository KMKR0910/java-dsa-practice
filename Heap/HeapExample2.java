package Heap;

public class HeapExample2 {//MinHeap using array 


   static class MinHeap{
      private int maxSize ;
      private int size;
      private int Heap[];


      MinHeap(int maxSize){
         this.size=0;
         this.maxSize=maxSize;
         Heap = new int [this.maxSize+1];
         Heap[0]=Integer.MAX_VALUE;

      }

      public int parent(int pos){
         return pos/2;

      }
      public int leftChild(int pos){
         return 2*pos;
      }
      public int rightChild(int pos){
         return (2*pos)+1;
      }
      public boolean iSLeafNode(int pos){
         if(pos>size/2 && pos<=size){
            return true;
         }return false;
      }

      public void insert(int item){
         Heap[++size]=item;
         int current=size;

         while(Heap[current]<Heap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
         }
      }

      public void swap(int fpos,int spos){
         int tmp=Heap[fpos];
         Heap[fpos]=Heap[spos];
         Heap[spos]=tmp;


      }

      public int deleteRoot(){
         int tmp=Heap[1];
         Heap[1]=Heap[size];
         size--;
         MinHeapfy(tmp);
         return tmp;
      }


      public void MinHeapfy(int pos){

         if(!iSLeafNode(pos)){
            return;}

            if (Heap[pos]>Heap[leftChild(pos)] || Heap[pos]>Heap[rightChild(pos)]){

               if (Heap[leftChild(pos)]>Heap[rightChild(pos)]){

                  swap(pos,leftChild(pos));
                  MinHeapfy(leftChild(pos));

               }
               else{
                  swap(pos, rightChild(pos));
                  MinHeapfy(rightChild(pos));
               }
            }
         }

      }



   
   }
   
}
