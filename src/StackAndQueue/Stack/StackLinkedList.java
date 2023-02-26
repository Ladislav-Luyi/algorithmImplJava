package StackAndQueue.Stack;


public class StackLinkedList {

    private Node node = null;

    private class Node{
        Node next;
        String data;
    }


    void push(String data){
        Node old = node;
        node = new Node();

        node.data = data;

        node.next = old;
    }

    boolean isEmpty(){
        return node == null;
    }

    String pop(){
        String data = node.data;
        node = node.next;

        return data;
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    //peek
    //print

}
