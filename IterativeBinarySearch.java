public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] arrayForSearch = {1,2,3,4,5,6,7,8,9,10,11};
        int targetNumber = 8;
        int low = 0;
        int high = arrayForSearch.length -1;
        System.out.println( search(arrayForSearch, low, high, targetNumber) );
    }

    private static int search(int[] array, int low, int high, int target){
        int index = -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                index = mid;
                break;
            }

            if (array[mid] < target)
                low = mid + 1;

            if (array[mid] > target)
                high = mid - 1;
        }

        return index;
    }
}
