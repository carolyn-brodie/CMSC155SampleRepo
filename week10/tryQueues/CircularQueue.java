package week10.tryQueues;
import java.util.Arrays;

public class CircularQueue {
	
	private static final int CAPACITY = 5;
	private int head;
	private int tail;
	private String[] theQueue;
	private int count = 0;
	
	public CircularQueue()
	{
		head = 0;  //spot to be removed next
		tail = 0;  //first empty spot
		count = 0;
		theQueue = new String[CAPACITY];
	}
	
	public void enqueue(String item) 
	{


	}
	

	public String dequeue() 
	{
		String out = "";

		return out;
	}
	
	
	public String peek()
	{
		return "";
	}


	public void justArray(){
        System.out.println(Arrays.toString(theQueue));
    }
	
	public String toString()
	{
		String out = "";
		for (int i = 0; i < count; i++)

			    out = out + theQueue[(head + i) % CAPACITY] + " ";

		return out;
	}
}
