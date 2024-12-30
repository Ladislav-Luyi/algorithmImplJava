package graph.weighted;

import StackAndQueue.Bag;

// convention allow self loop and parallel edges
public class EdgeWeightedGraph {

    Bag<Edge>[] adj;
    private final int V;
    public EdgeWeightedGraph(int V) {
        this.V = V;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++){
            adj[v] = new Bag<>();
        }
    }

    public void addEdge(Edge e){
        int v = e.either();
        int w = e.other(v);
        adj[v].push(e);
        adj[w].push(e);
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }
    public Iterable<Edge> edges(){
        return null;
    }

    // number of vertices
    public int V(){
        return 0;
    }

    // number of edges
    public int E(){
        return 0;
    }

    @Override
    public String toString() {
        return "EdgeWeightedGraph{}";
    }
}
