package Sorting;

import java.util.Arrays;


public class MergeSortImproved {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        // improvement client does not need to know specifics of arguments
        mergeSort( a );

        System.out.println( Arrays.toString(a) );

    }

    private static void mergeSort(int[] a) {
        // improvement if array is created in recursion that's a bug which leads to poor performance of merge sort
        int[] tmpArray = new int[a.length];
        //there is a bit overhead with mergeSort for small arrays; for small arrays you call call for example insertionSort
        mergeSort(a, tmpArray, 0, a.length - 1);

    }


    private static void mergeSort(int[] array, int[] helpArray, int lb,int ub){

        if ( lb >= ub)
            return;

        // improvement to prevent integer  overflow
        int mid =  lb + (ub - lb) / 2;


        mergeSort(array, helpArray, lb, mid);
        mergeSort(array, helpArray, mid + 1, ub);
        merge(array, helpArray, lb, mid, ub);

    }
    // there is also Bottom up merge sort without recursion
    private static void merge(int[] a, int[] b, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;


        int k = lb;
        while( i <= mid && j <= ub ){
            if (a[i] <= a[j]){
                b[k] = a[i];
                k++;
                i++;
            } else
            {
                b[k] = a[j];
                k++;
                j++;
            }
        }

        while (i <= mid ){
            b[k] = a[i];
            k++;
            i++;
        }


        while (j <= ub ){
            b[k] = a[j];
            k++;
            j++;
        }

        for (int l = lb; l <= ub; l++){
            a[l] = b[l];
        }

    }
}


