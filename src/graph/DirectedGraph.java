package graph;

import StackAndQueue.Bag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DirectedGraph {
    Bag<Integer>[] listBags;
    Set<Integer> V = new HashSet<>(); // all vertices
    DirectedGraph(int n){
        listBags = new Bag[n];
        for (int i = 0; i < listBags.length; i++){
            listBags[i] = new Bag<>();
        }
    }

    // this is difference to Adjacency list (in our case undirected graph)
    void addEdge(int vertex1, int vertex2){
        listBags[vertex1].push(vertex2);
        V.add(vertex1);
        V.add(vertex2);
    }

    void print(){
        for(int i = 0; i < listBags.length; i++){
            Iterator<Integer> iterator = listBags[i].iterator();
            while (iterator.hasNext()){
                System.out.println( i + " - " + iterator.next() );
            }
        }
    }

    Iterator<Integer> getAdjacencyVertecies(int i){
        return listBags[i].iterator();
    }

    public static void main(String[] args) {
        DirectedGraph list = new DirectedGraph(10);
        list.addEdge(0,1);
        list.addEdge(5,6);
        list.addEdge(0,5);
        list.print();
    }
}
