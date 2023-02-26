package Factorial;

public class Factorial {

    static int calculate(int n){
        System.out.println(n);
        if (n == 0)
            return 1;

//        return n * calculate(n--); // cannot be used because here variable is first used and only then decreased, so you are calling method always with same value
        return n * calculate(n -  1);
//        return n * calculate(--n); // same

    }

    public static void main(String[] args) {
        System.out.println(
            calculate(5)
        );
    }
}
