package sr.unasat.search;

import sr.unasat.Graph;
import sr.unasat.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeptFirstSearch {
    public static void DFS(Graph graph, Vertex v) {

        if ((graph != null) && (v != null)) {
            Stack<Vertex> stack = new Stack<Vertex>();
            List<Vertex> list = new ArrayList<Vertex>();
            stack.push(v);
            list.add(v);
            while (!stack.empty()) {
                Vertex temp = stack.pop();
                System.out.print(temp + " "); //Printing the root
                for (Vertex i : graph.getAdjacentVertex(temp)) {
                    if (!list.contains(i)) {
                        list.add(i);
                        stack.push(i);
                    }
                }
            }

        }

    }

    /*
     * DFS Algorithm using Recursion
     */
    public static void recursiveDFS(Graph graph, Vertex v) {

        if ((graph != null) && (v != null)) {
            List<Vertex> list = new ArrayList<Vertex>();
            dfsUtil(graph, list, v);
        }

    }

    private static void dfsUtil(Graph graph, List<Vertex> list, Vertex ver) {
        list.add(ver);
        System.out.print(ver + " ");
        for (Vertex i : graph.getAdjacentVertex(ver)) {
            if (!list.contains(i)) {
                list.add(i);
                dfsUtil(graph, list, i);
            }
        }

    }
}
