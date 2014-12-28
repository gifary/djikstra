package djikstra;

 
public class Dijkstra {
   private static final Graph.Edge[] GRAPH = {
      new Graph.Edge("T1", "A", 2),
      new Graph.Edge("T1", "B", 3),
      new Graph.Edge("T1", "C", 4),
      new Graph.Edge("T1", "D", 3),
      new Graph.Edge("T1", "G", 4),
      new Graph.Edge("T1", "J", 5),
      new Graph.Edge("T1", "M", 6),
      new Graph.Edge("T1", "P", 7),
      new Graph.Edge("T1", "K1", 6),
      new Graph.Edge("A", "K1", 6),
      new Graph.Edge("D", "K1", 5),
      new Graph.Edge("G", "K1", 4),
      new Graph.Edge("J", "K1", 3),
      new Graph.Edge("M", "K1", 2),
      new Graph.Edge("P", "K1", 1),
      new Graph.Edge("A","B",1),
      new Graph.Edge("A","D",1),
      new Graph.Edge("B","C",1),
      new Graph.Edge("B","E",1),
      new Graph.Edge("C","F",1),
      new Graph.Edge("D","E",1),
      new Graph.Edge("D","G",1),
      new Graph.Edge("E","F",1),
      new Graph.Edge("E","H",1),
      new Graph.Edge("F","I",1),
      new Graph.Edge("G","H",1),
      new Graph.Edge("G","J",1),
      new Graph.Edge("H","K",1),
      new Graph.Edge("H","I",1),
      new Graph.Edge("I","L",1),
      new Graph.Edge("J","K",1),
      new Graph.Edge("J","M",1),
      new Graph.Edge("K","L",1),
      new Graph.Edge("K","N",1),
      new Graph.Edge("L","O",1),
      new Graph.Edge("M","N",1),
      new Graph.Edge("M","P",1),
      new Graph.Edge("N","Q",1),
      new Graph.Edge("N","O",1),
      new Graph.Edge("O","R",1),
      new Graph.Edge("P","Q",1),
      new Graph.Edge("Q","R",1),
      //rute sebaliknya
      new Graph.Edge("B","A",1),
      new Graph.Edge("D","A",1),
      new Graph.Edge("C","B",1),
      new Graph.Edge("E","B",1),
      new Graph.Edge("F","C",1),
      new Graph.Edge("E","D",1),
      new Graph.Edge("G","D",1),
      new Graph.Edge("F","E",1),
      new Graph.Edge("H","E",1),
      new Graph.Edge("I","F",1),
      new Graph.Edge("H","J",1),
      new Graph.Edge("J","G",1),
      new Graph.Edge("K","H",1),
      new Graph.Edge("I","H",1),
      new Graph.Edge("L","I",1),
      new Graph.Edge("K","J",1),
      new Graph.Edge("M","J",1),
      new Graph.Edge("L","K",1),
      new Graph.Edge("N","K",1),
      new Graph.Edge("O","L",1),
      new Graph.Edge("N","M",1),
      new Graph.Edge("P","M",1),
      new Graph.Edge("Q","N",1),
      new Graph.Edge("O","N",1),
      new Graph.Edge("R","O",1),
      new Graph.Edge("Q","P",1),
      new Graph.Edge("R","Q",1),
      
   };
  
   
   private static final String START ="A";
   private static final String END = "M";
 
   public static void main(String[] args) {
     
      
	  Graph g = new Graph(GRAPH);
    //  Graph g2 = new Graph(GRAPH);
      //Edge edge[]=new Edge[10];
    
     g.dijkstra(START);
      g.printPath(END);
      /* 
      g2.dijkstra("H");
      g2.printPath("K1");
      */
      //g.printAllPaths();
   }
}
 

