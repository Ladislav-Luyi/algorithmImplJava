package Sorting;



import java.util.Arrays;

public class ShellSort {

    static void sort(int [] array){


        // computing optimal gap
        int gap = 1;
        while( gap < array.length/3 ) gap = gap * 3 + 1;
        System.out.println("gap: " + gap);

//        while(gap >= 1) {
        for(;gap>=1; gap /= 3){
            for (int i = gap; i < array.length; i++) {

                // here important point to realize is this loop
                // here we are comparing element j to j -1 because we want to compare elements in nested loop to each other and swap each which is higher on the right
                for (int j = i; j >= gap; j -= gap) {
                    if (array[j] < array[j - gap])
                        swap(array, j, j - gap);
                    else
                        break;
                }
            }

            System.out.println( "debug: " +  Arrays.toString(array) );
            //decreasing gap
//            gap = gap / 3;
        }
    }

    static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        sort( a );

        System.out.println( Arrays.toString(a) );

    }
}

