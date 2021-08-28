package sr.unasat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
    public void computeShortestPaths(Vertex sourceVertex){

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        sourceVertex.setVisited(true);

        while( !priorityQueue.isEmpty() ){
            // Getting the minimum distance vertex from priority queue
            Vertex vertex= priorityQueue.poll();
           // Vertex actualVertex = priorityQueue.poll();

            for(Edge edge : vertex.getAdjacenciesList()){

                Vertex v = edge.getTargetVertex();
            //    if(!v.isVisited())
                if (!v.isVisited())
                {
                    double newDistance = vertex.getDistance() + edge.getWeight();

                    if
                    (newDistance < v.getDistance() ){
                      // (newDistance > v.getDistance1() ){
                        priorityQueue.add(v);
                        v.setDistance(newDistance);
                        v.setPredecessor(vertex);
                        priorityQueue.add(v);
                    }

                }
            }
            vertex.setVisited(true);
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex){
        List<Vertex> path = new ArrayList<>();

        for(Vertex vertex=targetVertex;vertex != null ;vertex=vertex.getPredecessor()){
            path.add(vertex);
        }
        Collections.max(path);
        Collections.reverse(path);
        return path;

    }

}
