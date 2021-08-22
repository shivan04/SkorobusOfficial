package sr.unasat;
import sr.unasat.Vertex;
import sr.unasat.Graph;
public class Register {


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


        vertexA.addNeighbour(new Edge("A", 5, vertexA, vertexB));
        vertexA.addNeighbour(new Edge("A", 6, vertexA, vertexC));
        vertexB.addNeighbour(new Edge("B", 6.50, vertexB, vertexD));
        vertexB.addNeighbour(new Edge("B", 4, vertexB, vertexC));
        vertexC.addNeighbour(new Edge("C", 3.50, vertexC, vertexD));
        vertexC.addNeighbour(new Edge("C", 5, vertexC, vertexE));
        vertexE.addNeighbour(new Edge("E", 5, vertexD, vertexE));


        graph.addEdge(vertexA, vertexB, graph.isDirected);
        graph.addEdge(vertexA, vertexC, graph.isDirected);
        graph.addEdge(vertexB, vertexD, graph.isDirected);
        graph.addEdge(vertexB, vertexC, graph.isDirected);
        graph.addEdge(vertexC, vertexD, graph.isDirected);
        graph.addEdge(vertexD, vertexE, graph.isDirected);
        graph.addEdge(vertexC, vertexE, graph.isDirected);

    }


}
