package LinkedList;
import java.util.*;

public class LinkedlistClassExample{


   public static void main(String[]args){
      LinkedList<Integer>a1=new LinkedList<>();
      a1.add(1);
      a1.add(2);
      a1.add(3);

      Iterator<Integer>itr=a1.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
   
}