import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arrayForSoring = {15,30,0,7,8,9,13,12,10 };
        sort(arrayForSoring, 0, arrayForSoring.length-1);
        System.out.println(Arrays.toString(arrayForSoring));
    }

    public static void sort(int[] array, int low, int high){
        if (low < high){

            int pivot = partition(array, low, high);
            sort(array, low, pivot-1);
            sort(array, pivot+1, high);

        }

    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j < high ; j++ ){

            if(array[j] < pivot){
                i++;
                swap(array,i,j);
            }
        }

        swap(array,i+1, high );
        return i+1;

    }


    private static void swap(int[] array,int index1, int index2){
        int tmpValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tmpValue;
    }

}
