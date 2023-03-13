package week10.tryQueues;

public class QueueTesterTwo {

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue("zero");
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        q.enqueue("four");
        q.enqueue("five");
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.justArray();
        q.enqueue("five");
        System.out.println(q);
        q.justArray();
    }
}
