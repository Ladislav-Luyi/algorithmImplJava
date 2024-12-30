package graph;

import java.util.Iterator;

// can be used for directed and also for undirected graphs
/*
usability:
reachability
path finding
topological sort
directed cycle detection
 */
public class Dfs {
    boolean[] isEdgeVisited;
    Integer[] edgeTo;

    Dfs(AdjacencyList al, int s){
        isEdgeVisited = new boolean[al.listOfList.size()];
        edgeTo = new Integer[al.listOfList.size()];
        doDfs(al, s);
    }

    void doDfs(AdjacencyList al, int v){
        System.out.println("Processing " + v);
        isEdgeVisited[v] = true;
        Iterator<Integer> iterator = al.getAdjacencyVertecies(v);
        while (iterator.hasNext()){
            int currentVertex = iterator.next();
            if (!isEdgeVisited[currentVertex]){
                edgeTo[currentVertex] = v;
                doDfs(al, currentVertex);
            }
        }
    }

    void showPathBack(int i){
        Integer v = edgeTo[i];
        System.out.println(i  + " -> " + v);
        while(true){
            if (v == null || edgeTo[v] == null)
                break;
            if (v == edgeTo[v])
                break;
            System.out.println(v  + " -> " + edgeTo[v]);
            v = edgeTo[v];
        }

    }

    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList(10);
        adjacencyList.addEdge(0,1);
        adjacencyList.addEdge(1,2);
        adjacencyList.addEdge(2,3);
        adjacencyList.addEdge(3,4);
        adjacencyList.addEdge(5,6);

        Dfs dfs = new Dfs(adjacencyList,0);
//        System.out.println(Arrays.toString(dfs.edgeTo));
        dfs.showPathBack(4);
    }
}
