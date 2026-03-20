package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphExample1 {
   /// for undirected graph

   static class Graph{
      int v;
      LinkedList<Integer> adjListArray[];

      Graph(int v){
         this.v=v;
         adjListArray= new LinkedList[v];

         for (int i=0; i<v;i++){
            adjListArray[i]=new LinkedList<>();
         }
      }

      void addEdge(int src,int des){
         adjListArray[src].addFirst(des);
         adjListArray[des].addFirst(src);

      }

      // void printGraph(){  /// from for each loop

      //    for (int i=0;i<v;i++){
      //       System.out.println("Head");

      //       for(Integer p:adjListArray[i]){
               
      //           System.out.println(" -> "+p);

      //       }
      //       System.out.println("\n");
           


      //    }
      // }
      // void printGraph (){/// from iterator loop
      //    for (int i=0;i<v;i++){
      //       System.out.println("Verticles "+i);
      //       System.out.println("Head");

      //       Iterator<Integer> itr1= adjListArray[i].iterator();

      //       while(itr1.hasNext()){
      //          System.out.println(" -> "+itr1.next());
      //       }
      //    }
      //    System.out.println("\n");


      // }

      void printGraph(){// from noraml for loop 
         for (int i=0;i<v;i++){
            System.out.println("Verticles "+i);
            System.out.println("Head");

            LinkedList<Integer>ls1 = adjListArray[i];
            for(int j=0;j<ls1.size();j++){
               System.out.println(" -> "+ls1.get(j));
            } 
         }System.out.println("\n");
      }

   }

   public static void main(String[]args){
      int V=3;
      Graph gra= new Graph(V);
      gra.addEdge(0, 2);
      gra.addEdge(0, 7);
      gra.addEdge(7, 2);
      gra.printGraph();
   }
   

   
}
