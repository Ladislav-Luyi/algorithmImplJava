public class RecursiveLinearSearch {

    public static void main(String[] args)  {
        int[] arrayForSearching = {15,30,0,7,8,9,13,12,10};
        int targetValue = 10;

        System.out.println("Target value is on index: " + search(arrayForSearching, targetValue, 0));

    }

    public static int search(int[] array,int targetValue, int startIndex){
        if (startIndex == array.length)
            return -1;
        if(array[startIndex] == targetValue){
            return startIndex;
        }else{
            return search(array,targetValue,startIndex+1);
        }

    }
}
