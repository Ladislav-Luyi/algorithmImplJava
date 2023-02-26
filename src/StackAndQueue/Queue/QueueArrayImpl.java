package StackAndQueue.Queue;

public class QueueArrayImpl {
    private String[] array = new String[10];
    int head, tail = 0;

    void enqueue(String data){
        array[tail++] = data;
    }

    String dequeue(){
        if (head == tail)
            throw new RuntimeException("Underflow");

        String data = array[head];

        //avoid hoisting
        array[head] = null;
        head++;

        return data;
    }

    public static void main(String[] args) {
        QueueArrayImpl q = new QueueArrayImpl();
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
        System.out.println(q.dequeue());
    }


}

