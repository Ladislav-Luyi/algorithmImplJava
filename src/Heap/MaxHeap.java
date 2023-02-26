package Heap;

import java.util.Arrays;

public class MaxHeap {
    private Integer[] array;
    private int index = 1;

    public MaxHeap(int length) {
        //
        this.array = new Integer[length + 1];
    }

    boolean isEmpty(){
        return array[1] == null;
    }

    public void add(int i){
        array[index] = i;
        swim(index);
        index++;

    }

    //novy element stale pridavame na dalsie volne miesto v array a potom ho posuvame hore po parrentoch
    private void swim(int index) {

        while(true) {
            //there are no parents
            if (index == 1)
                return;

            int parent = index / 2;

            if (array[index] > array[parent]) {
                swap(index, index / 2);
                index = index / 2;
            }
            else{
                break;
            }
        }

    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //deleting maximum value; pri max heap stale iba max value vymazavame, nie inu value
    public Integer delete(){
        if (isEmpty())
            return null;

        int result = array[1];
        swap(index - 1, 1);
        // to avoid loitering
        array[index - 1] = null;
        index--;
        //move value to proper place to respect properties of max heap
        sink(1);

        return result;
    }

    private void sink(int i) {

        while(true) {
            if ( i * 2 > array.length - 1)
                break;

            //if there is no left child then there will be also no right child
            if ( array[i*2] == null)
                break;

            int leftChild = i * 2;
            int rightChild = i * 2 + 1;
            int higherChild = getHigherChild(leftChild, rightChild);

            if (array[i] < array[higherChild]) {
                swap(i, higherChild);
                i = higherChild;
            }
            else
                break;
        }

    }

    private int getHigherChild(int leftChild, int rightChild) {
        if (array[leftChild] == null)
            return rightChild;

        if (array[rightChild] == null)
            return leftChild;

        return array[leftChild] > array[rightChild] ? leftChild : rightChild;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,3,2,4,1,7,6,8,9,0,11,12,10,13,13};

        System.out.println( Arrays.toString(a) );

        MaxHeap maxHeap = new MaxHeap(a.length);

        for(int i = 0; i < a.length; i++){
            maxHeap.add( a[i] );
        }

        for(int i = 0; i < maxHeap.array.length; i++){
            System.out.println( maxHeap.delete() );
            System.out.println( Arrays.toString(maxHeap.array) );
        }

        System.out.println( Arrays.toString(maxHeap.array) );



    }
}
