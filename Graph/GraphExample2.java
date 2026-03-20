package Graph;

import java.util.LinkedList; //// for directed  graph

public class GraphExample2 {

   static class Graph{

      int V;
      LinkedList<Integer> adjListArray[];

      Graph(int V){
         this.V=V;
         adjListArray= new LinkedList[V];
         for(int i=0;i<V;i++){

            adjListArray[i]= new LinkedList<>();
         }
      }

      void addEdge(int src,int des){
         adjListArray[src].addFirst(des);
      }


      void printGraph(){
         for(int i=0;i<V;i++){

            System.out.println("Vertices "+i+1); ///or simply use i ...
            System.out.println("Head ");
            for(Integer p:adjListArray[i]){
               System.out.println(" -> "+p+1 );/// or simply use p 
            }
         }
      }  //// check code with dfs and bfs also /////
   }
   
}
