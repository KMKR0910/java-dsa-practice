package Sort;

public class InsertionSortExample1 {

   static class InsertSort{

   void insertionSort(int array[]){


      int n =array.length;
      

      for (int i=1;i<n;i++){
         int key=array[i];

         int j=i-1;
         while(j<=0 && array[j]>key){
            array[j+1]=array[j];
            j--;
         }
         array[j+1]=key;

         

         

      }
   }

   void printArray(int array[]){
      int n= array.length;

      for (int i=0;i<n;i++){
         System.out.println(array[i]+" ");
      }
      System.out.println();
   }

   }
   public static void main(String[]args){
      int array[]={12,5,45,6};
      InsertSort i1= new InsertSort();
      i1.insertionSort(array);

      i1.printArray(array);

   }
   
}

