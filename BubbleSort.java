
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayForSoring = {15,30,0,7,8,9,13,12,10};
        sort(arrayForSoring);
        System.out.println(Arrays.toString(arrayForSoring));
    }

    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j+1] )
                    swap(array, j, j + 1);
        }
    }



    private static void swap(int[] array,int index1, int index2){
        int tmpValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tmpValue;
    }
}
