package sr.unasat.search;
import sr.unasat.Edge;

import java.util.ArrayList;
import java.util.List;

public class Vertex1 implements Comparable<Vertex1> {
        private String id;
        private String name;
        private List<Edge> adjacenciesList;
        private boolean visited;
        private Vertex1 predecessor;
        private double distance = Double.MAX_VALUE;
        private double distance1 = Double.MIN_VALUE;

        public Vertex1(String id, String name) {
                this.id = id;
                this.name = name;
                this.adjacenciesList = new ArrayList<>();
        }

        public void addNeighbour(Edge edge) {
                this.adjacenciesList.add(edge);
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public List<Edge> getAdjacenciesList() {
                return adjacenciesList;
        }

        public void setAdjacenciesList(List<Edge> adjacenciesList) {
                this.adjacenciesList = adjacenciesList;
        }

        public boolean isVisited() {
                return visited;
        }


        public boolean isVisited1() {
                return visited;
        }

        public void setVisited(boolean visited) {
                this.visited = visited;
        }

        public Vertex1 getPredecessor() {
                return predecessor;
        }

        public void setPredecessor(Vertex1 predecessor) {
                this.predecessor = predecessor;
        }

        public double getDistance() {
                return distance;
        }

        public void setDistance(double distance) {
                this.distance = distance;
        }


        public double getDistance1() {
                return distance1;
        }

        public void setDistance1(double distance1) {
                this.distance1 = distance1;
        }


        public String getId() {

                return id;
        }

        public void setId(String id) {

                this.id = id;
        }


    /*@Override
    public String toString() {
        return this.name;
    }
    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance, otherVertex.getDistance());
    }*/

        @Override
        public int hashCode() {
                int hashValue = 3;
                final int primeFactor = 23;
                hashValue = hashValue * primeFactor + this.id.hashCode() + this.name.hashCode();
                return hashValue;
        }

        @Override
        public boolean equals(Object obj) {
                boolean flag = false;
                if ((obj == null) || (obj.getClass() != this.getClass())) {
                        return flag;
                } else {
                        Vertex1 v = (Vertex1) obj;
                        if ((v.getId() == this.getId()) && (v.getName() == this.getName())) {
                                flag = true;
                        }
                }

                return flag;
        }

        @Override
        public String toString() {

                return name;
        }

        @Override
        public int compareTo(Vertex1 otherVertex) {
               // return Double.compare(this.distance, otherVertex.getDistance());

               return Double.compare(this.distance1, otherVertex.getDistance1());
        }

}















