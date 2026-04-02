package Sort;

public class BubbleSortExample1 {
   static class BubbleSort{

      void bubbleSort(int array[]){
         int n =array.length;
         

         for(int i=0;i<n-1;i++){
            for (int j= 0;j<n-1-i;j++){
               if (array[j]>array[j+1]){
                  int temp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;

               }
            }
         }
      }

      void print(int array[]){

         int n = array.length;
         for (int i=0;i<n;i++){
            System.out.println(array[i]);
         }
      }
   }

   public static void main(String[]args){

      BubbleSort bs1=new BubbleSort();
      int array[]={1,8,4,5,9,6};
      bs1.bubbleSort(array);
      bs1.print(array);
   }
}
