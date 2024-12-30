package graph.weighted;

public class Edge implements Comparable<Edge>{
    private final int v, w;
    private final double weight;
    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    // either endpoint
    int either(){
        return v;
    }
    // the endpoint that's not v
    int other(int vertex){
        if (v == vertex){
            return w;
        }
        return v;
    }

    double weight(){
        return 0;
    }

    @Override
    public String toString() {
        return "Edge{}";
    }

    // compare edge to edge
    @Override
    public int compareTo(Edge that) {
        if (this.weight < that.weight){
            return -1;
        }else
        if (this.weight > that.weight){
            return +1;
        }
        return 0;
    }
}
