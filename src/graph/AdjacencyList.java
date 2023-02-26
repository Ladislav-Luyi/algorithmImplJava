package graph;

import StackAndQueue.Bag;

import java.util.Iterator;

public class AdjacencyList {
    Bag<Integer>[] listBags;
    AdjacencyList(int n){
        listBags = new Bag[n];
        for (int i = 0; i < listBags.length; i++){
            listBags[i] = new Bag<>();
        }
    }

    void addEdge(int vertex1, int vertex2){
        listBags[vertex1].push(vertex2);
        listBags[vertex2].push(vertex1);
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
        AdjacencyList list = new AdjacencyList(10);
        list.addEdge(0,1);
        list.addEdge(5,6);
        list.addEdge(0,5);
        list.print();
    }
}
