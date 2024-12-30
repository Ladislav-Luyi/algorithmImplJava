package graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// can be used for directed and also for undirected graphs
public class Bfs {
    boolean[] visitedVertecies;
    Integer[] edgeTo;

    Bfs(AdjacencyList adjacencyList, Integer i){
        visitedVertecies = new boolean[adjacencyList.listOfList.size()];
        edgeTo = new Integer[adjacencyList.listOfList.size()];

        doBfs(adjacencyList, i);


    }

    private void doBfs(AdjacencyList adjacencyList, Integer i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (!q.isEmpty()) {

            Integer currentVertex = q.poll();
            visitedVertecies[currentVertex] = true;
            Iterator<Integer> iterator = adjacencyList.getAdjacencyVertecies(currentVertex);
            while(iterator.hasNext()){
                Integer tmpV = iterator.next();
                if (!visitedVertecies[tmpV]) {
                    q.add(tmpV);
                    edgeTo[tmpV] = currentVertex;
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList(10);
        adjacencyList.addEdge(0,1);
        adjacencyList.addEdge(1,2);
        adjacencyList.addEdge(2,3);
        adjacencyList.addEdge(3,4);
        adjacencyList.addEdge(5,6);

        Bfs bfs = new Bfs(adjacencyList,0);
        System.out.println(Arrays.toString(bfs.edgeTo));
    }
}
