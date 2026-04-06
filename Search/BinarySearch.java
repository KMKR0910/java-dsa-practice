package Search;

public class BinarySearch {
   




   int binarySearh(int arr[],int l, int r,int x){



      int mid= l+(r-l)/2;

      if (arr[mid]==x){
         return mid;
      }

      else if(arr[mid]>x){
         binarySearh(arr, l, mid-1, x);

      }
      else{
         binarySearh(arr, mid+1, r, x);
      }
      return -1;


   }


}
