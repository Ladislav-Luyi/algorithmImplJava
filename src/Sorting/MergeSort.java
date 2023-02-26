package Sorting;

import java.util.Arrays;


public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        mergeSort( a, 0, a.length - 1 );

        System.out.println( Arrays.toString(a) );

    }


    private static void mergeSort(int[] a,int lb,int ub){
        // we are expecting at least two elements
        // if lb < ub there are two elements
        System.out.println("lb: " + lb + " ub: " + ub );
        if ( lb >= ub)
            return;

        int mid =  ( lb + ub ) / 2;

//        System.out.println("lb: " + lb + " ub: " + ub + " mid: " + mid);

        mergeSort(a, lb, mid);
        mergeSort(a,mid + 1, ub);
        merge(a, lb, mid, ub);

    }

    private static void merge(int[] a, int lb, int mid, int ub) {
//        System.out.println(Arrays.toString( a ));
//        System.out.println("Vstup: " + Arrays.toString(a) + "  " + "lb: " + lb + " ub: " + ub + " mid: " + mid);
        int[] b = new int[a.length];

        int i = lb;
        int j = mid + 1;

        // k cannot start from 0
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
//        System.out.println("a pole: " +   Arrays.toString( a ) +"b pole: "  + Arrays.toString( b ));
        while (i <= mid ){
            b[k] = a[i];
            k++;
            i++;
        }

//        System.out.println("a pole: " +   Arrays.toString( a ) +"b pole: "  + Arrays.toString( b ));
        while (j <= ub ){
            b[k] = a[j];
            k++;
            j++;
        }

//        System.out.println("a pole: " +   Arrays.toString( a ) +"b pole: "  + Arrays.toString( b ));
        for (int l = lb; l <= ub; l++){
            a[l] = b[l];
        }

//        System.out.println("Finale: " + Arrays.toString(a));

    }
}


