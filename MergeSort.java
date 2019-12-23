
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) throws InterruptedException {
        int[] arrayForSoring = {15,30,0,7,8,9,13,12,10};
        sort(arrayForSoring,0,arrayForSoring.length -1);
        System.out.println(Arrays.toString(arrayForSoring));


    }

    public static void sort(int[] array, int leftStart, int rightEnd){
        if (leftStart >= rightEnd)
            return;

        int mid = (leftStart + rightEnd) / 2;
        sort(array, leftStart, mid);
        sort(array, mid + 1, rightEnd);

        mergeHalves(array,leftStart,rightEnd);

    }

    private static void mergeHalves(int[] array, int leftStart, int rightEnd) {
        int[] tmpArray = new int[array.length];
        int tmpIndex = leftStart;
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int left = leftStart;
        int right = rightStart;

        //condition within while is cumulative; it means that in case one part is not true; condition will be not met
        while (left <= leftEnd && right <= rightEnd){
            if (array[left] <= array[right]){
                tmpArray[tmpIndex] = array[left];
                left++;
                tmpIndex++;
            }else{
                tmpArray[tmpIndex] = array[right];
                right++;
                tmpIndex++;
            }
        }

        while (left <= leftEnd){
            tmpArray[tmpIndex] = array[left];
            left++;
            tmpIndex++;
        }

        while(right <= rightEnd){
            tmpArray[tmpIndex] = array[right];
            right++;
            tmpIndex++;
        }

        for(int i = leftStart; i <= rightEnd ; i++){
            array[i] = tmpArray[i];
        }

    }


}
