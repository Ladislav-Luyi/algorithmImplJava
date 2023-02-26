package StackAndQueue.Stack;

public class StackArrayOptimized {
    String[] innerArray;
    int N = 0;

    public StackArrayOptimized() {
        innerArray = new String[1];
    }

    public static void main(String[] args) {
        StackArrayOptimized s = new StackArrayOptimized();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.push("e");
        s.push("f");
        s.push("g");
        s.push("h");
        s.push("i");
        s.push("j");


        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }


    private void push(String s) {
        if ( N == innerArray.length ) {
            System.out.println("Increasing size " + N + " " + innerArray.length);
            resizeArray(innerArray.length * 2);
        }

        innerArray[N++] = s;

    }

    private void resizeArray(int i) {
        String[] newArray = new String[i];

        // notice that we are not using innerArray.length, but N variable
        // if we would you innerArray.length, than we would have problem during decrease operation
        // also if array would be too big why to copy null objects
        for (int j = 0; j < N; j++) {
            newArray[j] = innerArray[j];
        }
        innerArray = newArray;
    }

    private String pop() {
        String tmp = innerArray[--N];
        //since pop was done; you want to avoid hoisting and get rid of not needed object so garbage collector can collect it
        innerArray[N] = null;

        if (N > 0 && N == innerArray.length / 4) {
            System.out.println("Decreasing size");
            resizeArray(innerArray.length / 2);
        }
        return tmp;
    }


}
