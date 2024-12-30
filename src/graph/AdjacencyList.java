package graph;

import StackAndQueue.Bag;

import java.util.*;

public class AdjacencyList {
    List<List<Integer>> listOfList;
    Set<Integer> V = new HashSet<>(); // all vertices
    public AdjacencyList(int n){
        listOfList = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            listOfList.add(new ArrayList<>());
        }
    }

    void addEdge(int vertex1, int vertex2){
        listOfList.get(vertex1).add(vertex2);
        listOfList.get(vertex2).add(vertex1);
        V.add(vertex1);
        V.add(vertex2);
    }

    void print(){
        for(int i = 0; i < listOfList.size(); i++){
            Iterator<Integer> iterator = listOfList.get(i).iterator();
            while (iterator.hasNext()){
                System.out.println( i + " - " + iterator.next() );
            }
        }
    }

    Iterator<Integer> getAdjacencyVertecies(int i){
        return listOfList.get(i) .iterator();
    }

    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList(10);
        list.addEdge(0,1);
        list.addEdge(5,6);
        list.addEdge(0,5);
        list.print();
    }
}
