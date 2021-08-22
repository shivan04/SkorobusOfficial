package sr.unasat.search;

import sr.unasat.Graph;
import sr.unasat.Vertex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathFirstSearch {
    public static void BFS (Graph graph, Vertex v) {

        if((graph == null) && (v == null)) {
            return;
        } else {
            Queue<Vertex> queue = new LinkedList<Vertex>(); //LinkedList implementation of a Queue
            List<Vertex> list = new ArrayList<Vertex>(); //this list is used to keep track of visited nodes
            queue.add(v);
            list.add(v);

            while(queue.peek() != null) {
                Vertex temp = queue.remove();
                System.out.print(temp + " ");
                for(Vertex i : graph.getAdjacentVertex(temp)) {
                    if(!list.contains(i)) {
                        list.add(i);
                        queue.add(i);
                    }
                }
            }

        }

    }
}
