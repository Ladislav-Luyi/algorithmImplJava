package Threesum;

public class Threesum {
    static void calculate(int[] a){
        for (int i = 0; i < a.length; i++){

            for (int j = i + 1; j < a.length; j++){

                for (int k = j + 1; k < a.length; k++){

                    if (a[i] + a[j] + a[k] == 0)
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7,9,0,-1};

        calculate(input);
    }
}
