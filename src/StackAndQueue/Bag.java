package StackAndQueue;

import java.util.Iterator;

public class Bag<T> implements Iterable<T>{
    Node head = null;

    @Override
    public Iterator<T> iterator() {
        return new IterableBag<T>(head);
    }

    class Node {
        Node nextNode;
        T input;
    }

    public void push(T s){
        if (head == null){
            head = new Node();
            head.input = s;
        }else{
            Node tmpNode = head;
            head = new Node();
            head.input = s;
            head.nextNode = tmpNode;
        }
    }

    class IterableBag<T> implements Iterator<T>{
        private Node head;
        IterableBag(Node n){
            head = n;
        }

        private T pop(){
            T t = (T) head.input;
            this.head = head.nextNode;
            return t;
        }

        @Override
        public boolean hasNext() {
            return head != null;
        }

        @Override
        public T next() {
            return pop();
        }
    }

    public static void main(String[] args) {
        Bag<String> b = new Bag();
        b.push("a");
        b.push("b");
        b.push("c");
        b.push("d");

        Iterator<String> i = b.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
