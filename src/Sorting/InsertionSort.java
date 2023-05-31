package Sorting;


import java.util.Arrays;
// https://www.youtube.com/watch?v=JU767SDMDvA
public class InsertionSort {

    static void sort(int [] array){

        for(int i = 0; i < array.length; i++){

            // here important point to realize is this loop
            // here we are comparing element j to j -1 because we want to compare elements in nested loop to each other and swap each which is higher on the right
            for(int j = i; j > 0; j--){
                if (  array[j] < array[j-1] )
                    swap(array, j, j - 1 );
                else
                    break;
            }

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

