package sr.unasat;








import static sr.unasat.search.BreathFirstSearch.BFS;

import static sr.unasat.search.DeptFirstSearch.DFS;




public class Application {

    private boolean isDirected;


    public static void main(String[] args) {
        Graph graph = new Graph(true);


        Vertex vertexA = new Vertex("A", "PARANAM");
        graph.addVertex(vertexA);
        Vertex vertexB = new Vertex("B", "LELYDORP");
        graph.addVertex(vertexB);
        Vertex vertexC = new Vertex("C", "HIGHWAY");
        graph.addVertex(vertexC);
        Vertex vertexD = new Vertex("D", "PARAMARIBO");
        graph.addVertex(vertexD);
        Vertex vertexE = new Vertex("E", "KWARASAN");
        graph.addVertex(vertexE);

//   ADD VERTEX
      //  Vertex vertexF = new Vertex("F", "LEIDING");
     //   graph.addVertex(vertexF);



        vertexA.addNeighbour(new Edge("A", 5, vertexA, vertexB));
        vertexA.addNeighbour(new Edge("A", 6, vertexA, vertexC));
        vertexB.addNeighbour(new Edge("B", 6.50, vertexB, vertexD));
        vertexB.addNeighbour(new Edge("B", 4, vertexB, vertexC));
        vertexC.addNeighbour(new Edge("C", 3.50, vertexC, vertexD));
        vertexC.addNeighbour(new Edge("C", 5, vertexC, vertexE));
        vertexE.addNeighbour(new Edge("E", 5, vertexD, vertexE));

      //  vertexD.addNeighbour(new Edge("F", 3.50, vertexD, vertexF));
       // vertexE.addNeighbour(new Edge("F", 3.50, vertexE, vertexF));


        graph.addEdge(vertexA, vertexB, graph.isDirected);
        graph.addEdge(vertexA, vertexC, graph.isDirected);
        graph.addEdge(vertexB, vertexD, graph.isDirected);
        graph.addEdge(vertexB, vertexC, graph.isDirected);
        graph.addEdge(vertexC, vertexD, graph.isDirected);
        graph.addEdge(vertexD, vertexE, graph.isDirected);
        graph.addEdge(vertexC, vertexE, graph.isDirected);

       // graph.addEdge(vertexE, vertexF, graph.isDirected);
        //graph.addEdge(vertexD, vertexF, graph.isDirected);





// SOUT BEGINT VAN AF HIER !!!!!

        graph.printGraph();

        System.out.println("Output of Depth First Search ");
        DFS(graph, new Vertex("A", "PARANAM"));


        System.out.println("");
        System.out.println("");


        System.out.println("Output of Breadth First Search: ");

        BFS(graph, new Vertex("B", "LELYDORP"));
        System.out.println();


//


        //Dijkstra


        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexA);
        Vertex vertexmain = vertexA;


        System.out.println("");
        System.out.println("Dijkstra ");
        System.out.println("======================================");
        System.out.println("Calculating minimum distance");
        System.out.println("======================================");

        System.out.println("Minimum fare from " + vertexmain + " to LELYDORP: " + vertexB.getDistance());
        System.out.println("Minimum fare from " + vertexmain + " to HIGHWAY: " + vertexC.getDistance());
        System.out.println("Minimum fare from " + vertexmain + " to PARAMARIBO: " + vertexD.getDistance());
        //System.out.println("Minimum fare from PARANAM to KWARASAN: "+vertexE.getDistance());
        System.out.println("Minimum fare from " + vertexmain + " to KWARASAN: " + vertexE.getDistance());

       // System.out.println("Minimum fare from " + vertexmain + " to LEIDING: " + vertexF.getDistance());




        System.out.println("=====================   =================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");

        System.out.println("Shortest route from " + vertexmain + " to LELYDORP: " + shortestPath.getShortestPathTo(vertexB));
        System.out.println("Shortest route from " + vertexmain + " to HIGHWAY: " + shortestPath.getShortestPathTo(vertexC));
        System.out.println("Shortest route from " + vertexmain + " to PARAMARIBO: " + shortestPath.getShortestPathTo(vertexD));
        System.out.println("Shortest route from " + vertexmain + " to KWARASAN: " + shortestPath.getShortestPathTo(vertexE));

        //System.out.println("Shortest route from " + vertexmain + " to LEIDING: " + shortestPath.getShortestPathTo(vertexF));

        //--------------------------------------------------------------------------------------//
// LONGEST PATH
        /*
        System.out.println("Maximum fare from " + vertexmain + " to LELYDORP: " + vertexB.getDistance());
        System.out.println("Maximum fare from " + vertexmain + " to HIGHWAY: " + vertexC.getDistance());
        System.out.println("Maximum fare from " + vertexmain + " to PARAMARIBO: " + vertexD.getDistance());
        //System.out.println("Maximum fare from PARANAM to KWARASAN: "+vertexE.getDistance());
        System.out.println("Maximum fare from " + vertexmain + " to KWARASAN: " + vertexE.getDistance());

        System.out.println("=====================   =================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");

        System.out.println("Longest route from " + vertexmain + " to LELYDORP: " + LongestPath.getLongestPathTo(vertexB));
        System.out.println("Longest route from " + vertexmain + " to HIGHWAY: " + LongestPath.getLongestPathTo(vertexC));
        System.out.println("Longest route from " + vertexmain + " to PARAMARIBO: " + LongestPath.getLongestPathTo(vertexD));
        System.out.println("Longest route from " + vertexmain + " to KWARASAN: " + LongestPath.getLongestPathTo(vertexE));




         */
        System.out.println("======================================");
        System.out.println("======================================");






    }


    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean isDirected) {
        this.isDirected = isDirected;
    }
}





