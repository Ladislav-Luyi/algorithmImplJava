
public class IterativeLinearSearch {

    public static void main(String[] args) {
        int[] arrayForSearching = {15,30,0,7,8,9,13,12,10};
        int targetValue = 10;

        System.out.println("Target value is on index: " + search(arrayForSearching, targetValue));

    }

    public static int search(int[] array,int targetValue){
        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == targetValue) {
                index = i;
                break;
            }
        }
        return index;
    }
}
