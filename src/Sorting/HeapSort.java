package Sorting;

import java.util.Arrays;

//in place algorithm which guaranties n log n
//cons: slower than qsort, not stable, poor use of memory cache
public class HeapSort {

    public HeapSort(int[] array) {
        // there is - 1 so we are able to reach also 0 element in the array
        for(int i = array.length / 2 - 1; i >= 0; i--){
            sink(array, i, array.length);
        }
    }

    // this method could be called also as heapify
    private void sink(int[] array, int i, int length) {
        // because of  - 1 in the loop
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;
        if(l <= length - 1 && array[l] > array[largest]){
            largest = l;
        }

        if(r <= length - 1 && array[r] > array[largest]){
            largest = r;
        }

        if(largest != i){
            swap(array, i, largest);
            sink(array, largest, length);
        }

    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0,11,12,10,13,13};

        System.out.println( Arrays.toString(a) );

        new HeapSort(a);

        System.out.println( Arrays.toString(a) );
    }
}
