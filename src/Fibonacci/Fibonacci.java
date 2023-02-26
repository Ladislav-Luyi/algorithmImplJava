package Fibonacci;

public class Fibonacci {
    //1 1 2 3 5 8 13 21 34
    static int calculate(int n){

        if (n < 3)
            return 1;
        else
            return calculate(n-1) + calculate(n-2);

    }



    public static void main(String[] args) {
        System.out.println(
            calculate(9)
        );
    }
}
