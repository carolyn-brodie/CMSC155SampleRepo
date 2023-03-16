package week10.tryQueues;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueExample {

	public static void main(String[] args) {
	    
        Queue<String> q = new LinkedList<>();
		q.add("I");
		q.add("am");
		q.add("not");
		q.remove();
		q.add("fine");
		String x = q.peek(); //should be am
		q.add("how");
		q.add("are");
		q.remove();
		q.add("you");
		String y = q.remove();  //should be not
		// q should be fine how are you
		System.out.println("x: " + x + " y: " + y + " q: " + q);

	}

}
