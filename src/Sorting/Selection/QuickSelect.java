package Sorting.Selection;




public class QuickSelect {

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0};

        System.out.println( sort(a, 2) );
    }

    private static int sort(int[] a, int k) {

        int result = sort(a, 0, a.length - 1, k);

        return result;

    }

    private static int sort(int[] a, int lB, int uB, int k) {
        while (lB < uB){
            int lock = partition(a, lB, uB);
            // binary search logic
            if (k < lock)
                uB = lock - 1;
            else if (k > lock)
                lB = lock + 1;
            else
                return k;
        }

        return k;

    }

    // same as in quicksort
    private static int partition(int[] a, int lB, int uB){
        int pivot = a[lB];
        int start = lB;
        int end = uB;


        while (start <= end){
            while(start <= pivot){
                start++;
            }

            while (end > pivot){
                end--;
            }

            if (start <= end)
                swap(a, start, end);

        }

        swap(a, end, lB);

        return end;
    }

    private static void swap(int a[], int b, int c){
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
