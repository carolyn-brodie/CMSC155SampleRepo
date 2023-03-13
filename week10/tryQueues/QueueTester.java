package week10.tryQueues;

public class QueueTester {

	public static void main(String[] args) {


        CircularQueue q = new CircularQueue();
        q.enqueue("I");
        q.enqueue("am");
        q.enqueue("not");
        q.dequeue();
        q.enqueue("fine");
        String x = q.peek(); //should be am
        q.enqueue("how");
        q.enqueue("are");
        q.dequeue();
        q.enqueue("you");
        String y = q.dequeue();  //should be not
        // q shoudl be fine how are you
        System.out.println("x: " + x + " y: " + y + " q: " + q);
        q.justArray();
		
		

	}

}
