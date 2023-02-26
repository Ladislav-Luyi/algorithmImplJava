package Sorting;


import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( Arrays.toString(a) );

        sort( a );

        System.out.println( Arrays.toString(a) );

    }

    private static void sort(int[] a) {
        //here suppose to be shuffle of array to prevent bad performance
        // we can do insertion sort for small array; for small array insertion sort would be faster
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lB, int uB) {
        if (lB >= uB)
            return;

        int lock = partition1(a, lB, uB);

        sort(a, lB, lock - 1);
        sort(a, lock + 1, uB);

    }
    //toto nam vracia pivot
    private static int partition(int[] a, int lB, int uB) {
        int start = lB;
        int end = uB;
        int pivot = a[lB];
        //si vsimni, ze pri iteraciach start a stop sa nenuluju
        while(start <= end){

            while(a[start] <= pivot){
                start++;
            }

            while(a[end] > pivot){
                end--;
            }

            //tato podmienka tu musi byt lebo tato vlastne robi to aby to malo cele zmysel
            //ide o to, ze start neskor bude za end a end bude za start v takom pripade nechces robit swap, lebo ti to nepojde
            // inymi slovami start moze byt viac ako end pri hybani s indexami
            //si vsimni, ze tato podmienka je rovnaka ako hlavna podmienka cyklu
            if (start <= end) {
                //v tejto casti start je na pozicii, kde je viac ako pivot element a end je na pozicii, kde je menej alebo rovne ako pivot element
                // nie naopak!
                // teda ich vymenime a budeme pokracovat
                change(a, start, end);
            }
        }
        //end na konci cykklu je menej ako start zaroven end bude na poslednom najviac z prava elemente co nebol vacsi ako pivot
        //teda ich vymenime
        change(a,lB, end);

        return end;
    }

    //https://www.youtube.com/watch?v=uXBnyYuwPe8&t=515s
    private static int partition1(int[] a, int lB, int uB) {
        int pivot = a[uB];
        int i = lB - 1;
        for (int j = lB; j < uB; j++){
            if (a[j] <= pivot){
                i++;
                change(a,i,j);
            }

        }
        change(a,i + 1, uB);

        return i + 1;
    }


    private static void change(int[] a, int start, int end) {
        int tmp = a[start];
        a[start] = a[end];
        a[end] = tmp;
    }
}
