package Sorting;

import java.util.Arrays;



public class IterativeMergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        sort( a );

        System.out.println( Arrays.toString(a) );

    }

    private static void sort(int[] a ){
        int N = a.length;
        int[] b =new int[N];

        for(int sz = 1; sz < N; sz = sz + sz){

            //size is lb + ub
            //so if lo is 6 and size is 2
            for (int lo = 0; lo < N - sz; lo += sz + sz){
                System.out.println("sz " + sz + " lo " + lo + " lb: " + lo + " mid " + ( lo + sz - 1 ) + " ub: " +  Math.min(lo + sz + sz -1, N-1));
                merge(a, b, lo, lo + sz - 1, Math.min(lo + sz + sz -1, N-1));
                }
        }

    }


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

