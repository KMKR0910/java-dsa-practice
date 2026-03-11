package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistClassExample2 {

public static class book{
   int id;
   String name,author;
   public book(int id,String name,String author){

      this.id=id;
      this.name=name;
      this.author=author;

   }
}

public static void main(String[]args){

   LinkedList<book> list1=new LinkedList<>();

   book b1 = new book(1, "ABC", "ABCD");
   book b2=new book(2, "BCD", "BCDE");
   book b3=new book(3,"CDE","CDEF");

   list1.add(b1);
   list1.add(b2);
   list1.add(b3);

   Iterator<book>itr=list1.iterator();
   while(itr.hasNext()){
      book b=itr.next();//each return value is stored in b
      System.out.println("ID:"+b.id+" Name:"+b.name+" Author:"+b.author);
   }

   for (book b:list1){ // enhanced for loop
      System.out.println("ID:"+b.id+" Name:"+b.name+" Author:"+b.author);
   }



}



   
}
