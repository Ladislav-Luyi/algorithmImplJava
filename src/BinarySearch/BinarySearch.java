package BinarySearch;

public class BinarySearch {
//    static int calculate(int[] array, int t){
//
//        int result = -1;
//
//        int min = 0;
//        int max = array.length - 1;
//        while (min < max) {
//            int mid = min + (max - min) / 2;
//
//            if (t == array[mid])
//                return mid;
//
//            if (t > array[mid])
//                min = mid + 1;
//            else
//                max = mid - 1;
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        int[] a = new int[]{
                1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
        };
        System.out.println(
            calculate(a, 6)
        );
    }

    // recursive
    static int calculate(int[] array, int t){
        int min = 0;
        int max = array.length - 1;

        return calculate(array, t, min, max);
    }

    private static int calculate(int[] array, int t, int min, int max) {

        if (min > max)
            return -1;

        // https://stats.stackexchange.com/questions/18626/is-there-a-term-for-min-max-min-2
        //  int mid = max + min/2; // this can cause overflow for int
        int mid = min + (max - min) / 2;


        if (t == array[mid])
            return mid;

        if (t > array[mid])
            return calculate(array, t, mid + 1, max);
        else
            return calculate(array, t, min, mid - 1);

    }
}
