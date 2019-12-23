
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arrayForSoring = {15,30,0,7,8,9,13,12,10};
        sort(arrayForSoring);
        System.out.println(Arrays.toString(arrayForSoring));
    }

    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++){
            int minIndex = i;

            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;
            swap(array, minIndex, i);
        }
    }



    private static void swap(int[] array,int index1, int index2){
        int tmpValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tmpValue;
    }
}
