package Quick_Union.Quick_Find;

public class QuickFind {

    int[] pole;
    QuickFind(int n){
        pole = new int[n];
        for (int i = 0; i < pole.length; i++){
            pole[i] = i;
        }
    }

    boolean isConneted(int n, int m){
        return pole[n] == pole[m];
    }

    void connect(int n, int m){
        int nI = pole[n];
        int mI = pole[m];

        for (int i = 0; i < pole.length; i++){
            if ( pole[i] == nI )
                pole[i] = mI;
        }
    }

    void print(){
        for (int i = 0; i < pole.length; i++){
            System.out.println( i + " je spojene s " + pole[i] );
        }

        System.out.println("=================");
    }
    public static void main(String[] args) {
        QuickFind u = new QuickFind(10);
        u.print();

        System.out.println(u.isConneted(1, 2));

        u.connect(1, 9);

        System.out.println(u.isConneted(1, 9));

        u.print();

        u.connect(3, 9);

        u.print();

        u.connect(4, 3);

        u.print();

        u.connect(4, 6);

        u.print();


    }
}
