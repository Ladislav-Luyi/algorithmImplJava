package Quick_Union;

public class Union {
    private int[] pole;

    Union(int n){
        pole = new int[n];
        for(int i = 0; i < n; i++){
            pole[i] = i;
        }
    }

//    int root(int n){
//        if (n != pole[n]) {
//            return find(pole[n]);
//        } else {
//            return n;
//        }
//    }

    int root(int n){
        while(n != pole[n]){
            n = pole[n];
        }

        return n;
    }

    boolean isConnected(int n, int m){
        int rootN = root(n);
        int rootM = root(m);

        return rootN == rootM;

    }

    void union(int n, int m){
        int rootN = root(n);
        int rootM = root(m);



        pole[rootN] = rootM;
    }

    void print(){
        for(int i = 0; i < pole.length; i++){
            System.out.println( "index " + i + " value " + pole[i] );
        }
        System.out.println("=========================\n");
    }

    public static void main(String[] args) {
        Union union = new Union(10);

        union.union(4, 3);
        union.union(3, 8);
        union.union(6, 5);
        union.union(9,4);
        union.union(2,1);
        union.union(5,0);
        union.union(7,2);
        union.union(6,1);
        union.union(7,3);
        union.print();



    }


}
