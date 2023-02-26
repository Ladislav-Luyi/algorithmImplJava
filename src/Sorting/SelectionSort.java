package Sorting;

import java.util.Arrays;

public class SelectionSort {

        static void sort(int [] array){

        for(int i = 0; i < array.length; i++){
            int min = i;

            // j has to be j = i +1;
            // if is its j = 1
            // then every subiteration starts from 1 which is wrong because in SelectionSort if i = 1 then we assume that i = 0 element is sorted etc.
            for(int j = i +1; j < array.length; j++){
                if (array[j] < array[min] )
                    min = j;

            }
            swap(array, i, min );
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

