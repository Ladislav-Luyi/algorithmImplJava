public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arrayForSearch = {1,2,3,4,5,6,7,8,9,10,11};
        int targetNumber = 8;
        int low = 0;
        int high = arrayForSearch.length -1;
        System.out.println( search(arrayForSearch, low, high, targetNumber) );
    }

    public static int search(int[] array, int low, int high, int target){
        int index = -1;
        int mid = (low + high) / 2;

        if (low > high)
            return index;

        if (array[mid] == target)
            index = mid;


        if (array[mid] < target)
            return search(array, mid + 1, high, target);

        if (array[mid] > target)
            return search(array, low, mid - 1, target);

        return index;
    }
}
