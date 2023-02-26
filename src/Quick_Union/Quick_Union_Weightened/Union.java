package Quick_Union.Quick_Union_Weightened;

public class Union {
    private int[] array;
    private int[] arraySize;

    Union(int n){
        array = new int[n];
        arraySize = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = i;
            arraySize[i] = 1;
        }
    }

//    int find(int n){
//        if (n != pole[n]) {
//            return find(pole[n]);
//        } else {
//            return n;
//        }
//    }

    int find(int n){
        while(n != array[n]){
            n = array[n];
        }

        return n;
    }

    void union(int n, int m){
        int rootN = find(n);
        int rootM = find(m);


        if ( arraySize[rootN] < arraySize[rootM] ) {
            array[rootN] = rootM;
            arraySize[rootM] += array[rootN];
        }

        else {
            array[rootM] = rootN;
            arraySize[rootN] += array[rootM];
        }


    }

    void print(){
        for(int i = 0; i < array.length; i++){
            System.out.println( "index " + i + " value " + array[i] );
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

//        for (int i = 0; i < union.arraySize.length; i++)
//            System.out.println(union.arraySize[i]);



    }


}
