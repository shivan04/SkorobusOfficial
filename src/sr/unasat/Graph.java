package sr.unasat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public boolean isDirected;
    private List<Vertex> vertex;
    private List<Edge> adjacenciesList;
    @SuppressWarnings("unused")
    private int numberOfVertices;
    @SuppressWarnings("unused")
    private int numberOfEdges;

    // While instantiating this graph, user needs to input the type of the Graph - Directed or Undirected
    public Graph(boolean isDirected) {
        this.vertex = new LinkedList<>();
        this.adjacenciesList = new LinkedList<Edge>();
        this.numberOfVertices = 0;
        this.numberOfEdges = 0;
        this.isDirected = isDirected;
    }

    public void addVertex(Vertex v) {
        vertex.add(v);
        this.numberOfVertices++;
    }

    public void addEdge(Vertex a, Vertex b, boolean isDirected) {
        Edge newEdge = new Edge();
        newEdge.setStartVertex(a);
        newEdge.setTargetVertex(b);
        adjacenciesList.add(newEdge);
        this.numberOfEdges++;
        if(!isDirected) {
            addEdge(b, a, true); //Recursive call to addEdge method if is a non-directed graph
        }
    }

    public boolean isConnected(Vertex m, Vertex n) {
        boolean connected = false;
        Edge tempEdge = new Edge();
        tempEdge.setStartVertex(m);
        tempEdge.setTargetVertex(n);

        for(Edge e : adjacenciesList) {
            if(e.equals(tempEdge)) {
                connected = true;
                break;
            }
        }

        return connected;
    }

    /*
     * This method finds the neighboring nodes connected to a given vertex.
     * This is a very important method to traverse a Graph used in BFS and DFS algorithms.
     *
     */
    public List<Vertex> getAdjacentVertex(Vertex v) {
        List<Vertex> list = new LinkedList<Vertex>();
        if((v != null) && (adjacenciesList != null)) {
            Iterator<Edge> iterator = adjacenciesList.iterator();
            while(iterator.hasNext()) {
                Edge temp = iterator.next();
                if(temp.getStartVertex().equals(v)) {
                    list.add(temp.getTargetVertex());
                }
            }

        }

        return list;
    }
    public void printGraph() {
        System.out.println("De beschikbaare locaties: " + this.vertex.size());
        System.out.println("De locaties:");
        for(Vertex v : this.vertex)
            System.out.println(v);
        System.out.println("                                                 ");

        System.out.println("Aantal edges: " + this.adjacenciesList.size());
        System.out.println("de gegeven edges:");
        for(Edge e : adjacenciesList)
            System.out.println(e);
        System.out.println("");
    }
}
