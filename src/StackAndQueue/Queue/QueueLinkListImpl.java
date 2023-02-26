package StackAndQueue.Queue;

public class QueueLinkListImpl {
    Node first, last;

    private static class Node{
        String data;
        Node next;
    }

    void enqueue(String data){
        if (first == null) {
            first = new Node();
            first.data = data;
            last = first;
            return;
        }

        Node oldLast = last;
        last = new Node();
        last.data = data;
        oldLast.next = last;
    }

    String dequeue(){
        String s = first.data;
        first = first.next;
        return s;
    }

    public static void main(String[] args) {
        QueueLinkListImpl q = new QueueLinkListImpl();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }


}
