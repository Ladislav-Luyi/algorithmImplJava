package Sorting;

import java.util.Arrays;

public class ThreeWayQuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        sort( a );

        System.out.println( Arrays.toString(a) );

    }

    private static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lB, int uB) {
        if (lB >= uB)
            return;

        int lt = lB;
        int gt = uB;
        int i = lB;

        while (i <= gt) {
            if (a[i] < a[lt]) {
                swap(a, i, lt);
                i++;
                lt++;
            }
            else if(i > lB){
                swap(a, i, uB);
                gt--;
            }
            else{
                i++;
            }
        }

        sort(a, lB, lt - 1);
        sort(a, gt + 1, uB);
    }

    private static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
