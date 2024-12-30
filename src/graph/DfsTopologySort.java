package graph;

import java.util.Iterator;
import java.util.Stack;

// can be used for DAG
// it is impossible if there is a cycle
/*
usability:

 */
public class DfsTopologySort {
    boolean[] isEdgeVisited;
    private Stack<Integer> reversePost;

    DfsTopologySort(DirectedGraph al){
        isEdgeVisited = new boolean[al.V.size()];
        reversePost = new Stack<>();
        for (Integer v : al.V) {
            if (!isEdgeVisited[v]){
                doDfs(al, v);
            }
        }
    }

    void doDfs(DirectedGraph al, int v){
        System.out.println("Processing " + v);
        isEdgeVisited[v] = true;
        Iterator<Integer> iterator = al.getAdjacencyVertecies(v);
        while (iterator.hasNext()){
            int currentVertex = iterator.next();
            if (!isEdgeVisited[currentVertex]){
                doDfs(al, currentVertex);
            }
        }
        reversePost.push(v);
    }

    public Iterable<Integer> reversePost(){
        return reversePost;
    }


    public static void main(String[] args) {
        DirectedGraph adjacencyList = new DirectedGraph(10);
        adjacencyList.addEdge(0,1);
        adjacencyList.addEdge(1,2);
        adjacencyList.addEdge(2,3);
        adjacencyList.addEdge(3,4);
        adjacencyList.addEdge(5,6);

        DfsTopologySort dfs = new DfsTopologySort(adjacencyList);
//        System.out.println(Arrays.toString(dfs.edgeTo));
        dfs.reversePost.iterator().forEachRemaining(System.out::println);
    }
}
