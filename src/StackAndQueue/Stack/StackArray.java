package StackAndQueue.Stack;

public class StackArray {
    String[] innerArray;
    int i = 0;

    public StackArray(int i) {
        innerArray = new String[i];
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(10);
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }


    private void push(String s) {
        innerArray[i++] = s;
    }

    private String pop() {
        return innerArray[--i];
    }


}
