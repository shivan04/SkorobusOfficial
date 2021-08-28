package sr.unasat;




import java.util.List;


import static sr.unasat.search.BreathFirstSearch.BFS;

import static sr.unasat.search.DeptFirstSearch.DFS;

import jdk.swing.interop.SwingInterOpUtils;
import sr.unasat.Register.*;

public class Application {

    private boolean isDirected;


    public static void main(String[] args) {
        Graph graph = new Graph(true);



        Vertex vertexA = new Vertex("A","PARANAM");
        graph.addVertex(vertexA);
        Vertex vertexB = new Vertex("B","LELYDORP");
        graph.addVertex(vertexB);
        Vertex vertexC = new Vertex("C","HIGHWAY");
        graph.addVertex(vertexC);
        Vertex vertexD = new Vertex("D","PARAMARIBO");
        graph.addVertex(vertexD);
        Vertex vertexE = new Vertex("E","KWARASAN");
        graph.addVertex(vertexE);


        vertexA.addNeighbour(new Edge("A",5,vertexA,vertexB));
        vertexA.addNeighbour(new Edge("A",6,vertexA,vertexC));
        vertexB.addNeighbour(new Edge("B",6.50,vertexB,vertexD));
        vertexB.addNeighbour(new Edge("B",4,vertexB,vertexC));
        vertexC.addNeighbour(new Edge("C",3.50,vertexC,vertexD));
        vertexC.addNeighbour(new Edge("C",5,vertexC,vertexE));
        vertexE.addNeighbour(new Edge("E",5,vertexD,vertexE));


        graph.addEdge(vertexA, vertexB,graph.isDirected);
        graph.addEdge(vertexA, vertexC, graph.isDirected);
        graph.addEdge(vertexB, vertexD, graph.isDirected);
        graph.addEdge(vertexB, vertexC, graph.isDirected);
        graph.addEdge(vertexC, vertexD, graph.isDirected);
        graph.addEdge(vertexD, vertexE, graph.isDirected);
        graph.addEdge(vertexC, vertexE, graph.isDirected);


// SOUT BEGINT VAN AF HIER !!!!!

        graph.printGraph();



/*
       System.out.println("Check if following vertices are connected");
        if(graph.isConnected(vertexA, vertexB))
            System.out.println(vertexA+" and "+vertexB+" Are connected");
        else
            System.out.println(vertexA+" and "+vertexB+" Are not connected");

        if(graph.isConnected(vertexA, vertexC))
            System.out.println(vertexA+" and "+vertexC+" Are connected");
        else
         //   System.out.println("PARANAM and HIGHWAY  are NOT connected.");
        System.out.println(vertexA+" and "+vertexC+" Are not connected");

        //Call getAdjacentVertex() to get neighboring nodes
        List<Vertex> temp = graph.getAdjacentVertex(new Vertex("A", "BOG"));
        System.out.println("Here are neighboring nodes of BOG: ");
        for(Vertex ver : temp) {
            System.out.println(ver);
        }

 */




//

        System.out.println("Output of Depth First Search using Non-Recursive DFS");
         DFS(graph, new Vertex("C", "HIGHWAY"));


        System.out.println("");
        System.out.println("");


        System.out.println("Output of Breadth First Search: ");
        //Output: A B F E
      BFS(graph, new Vertex("C", "HIGHWAY"));
        System.out.println();





        //Dijkstra
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexA);
        Vertex vertexmain = vertexA;


        System.out.println("");
        System.out.println("Dijkstra ");
        System.out.println("======================================");
        System.out.println("Calculating minimum distance");
        System.out.println("======================================");

        System.out.println("Minimum fare from "+vertexmain+" to LELYDORP: "+vertexB.getDistance());
        System.out.println("Minimum fare from "+vertexmain+" to HIGHWAY: "+vertexC.getDistance());
        System.out.println("Minimum fare from "+vertexmain+" to PARAMARIBO: "+vertexD.getDistance());
        //System.out.println("Minimum fare from PARANAM to KWARASAN: "+vertexE.getDistance());
        System.out.println("Minimum fare from " +vertexmain+ " to KWARASAN: "+vertexE.getDistance());

        System.out.println("=====================   =================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");

        System.out.println("Shortest route from "+vertexmain+" to LELYDORP: "+shortestPath.getShortestPathTo(vertexB));
        System.out.println("Shortest route from "+vertexmain+ " to HIGHWAY: "+shortestPath.getShortestPathTo(vertexC));
        System.out.println("Shortest route from "+vertexmain+" to PARAMARIBO: "+shortestPath.getShortestPathTo(vertexD));
        System.out.println("Shortest route from "+vertexmain+" to KWARASAN: "+shortestPath.getShortestPathTo(vertexE));



        System.out.println("======================================");
        System.out.println("======================================");



        System.out.println("Maximum fare from "+vertexmain+ " to LELYDORP: "+vertexB.getDistance1());
        System.out.println("Maximum fare from "+vertexmain+" to HIGHWAY: "+vertexC.getDistance1());
        System.out.println("Maximum fare from "+vertexmain+" to PARAMARIBO: "+vertexD.getDistance1());
        System.out.println("Maximum fare from "+vertexmain+" to KWARASAN: "+vertexE.getDistance());


    }
    public boolean isDirected() {
        return isDirected;
    }
    public void setDirected(boolean isDirected) {
        this.isDirected = isDirected;
    }


}
