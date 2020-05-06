import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsetsOfSet {

    private static List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {

       integers.add(1);
       integers.add(2);
       integers.add(3);
       integers.add(4);
       integers.add(5);

       showAllSubsetsOfSet(integers);
    }

    public static void showAllSubsetsOfSet(List<Integer> integers){
        Integer[] tmpArray = new Integer[integers.size()];

        showAllSubsetsOfSet(integers, tmpArray, 0);
    }

    private static void showAllSubsetsOfSet(List<Integer> integers, Integer[] tmpArray, int index){
        if (index == integers.size() ) {
            System.out.println(Arrays.toString(tmpArray));
            return;
        }

        tmpArray[index] = null;

        showAllSubsetsOfSet(integers, tmpArray, index + 1);

        tmpArray[index] = integers.get(index);

        showAllSubsetsOfSet(integers, tmpArray, index + 1);
    }
}
