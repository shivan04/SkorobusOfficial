package sr.unasat;
public class Edge {
    private String id;
    private double weight;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(String id, double weight, Vertex startVertex, Vertex targetVertex) {
        this.id = id;
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public Edge() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {

        this.id = id;
    }


    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return flag;
        } else {
            Edge e = (Edge) obj;
            if ((e.startVertex.equals(this.startVertex)) && (e.targetVertex.equals(this.targetVertex))) {
                flag = true;
            }
        }

        return flag;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        final int prime = 23;
        hash = hash * prime + this.startVertex.hashCode() + this.targetVertex.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return startVertex + " -> " + targetVertex;
    }
}