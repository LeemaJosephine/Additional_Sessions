package collectionsConcept;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> customers = new LinkedList<String>();
		
		// add elements
		
		customers.add("John");
		customers.add("Priya");
		customers.add("Rahul");
		
		System.out.println("Queue: "+customers);
		
		// Remove first person
		System.out.println("Served: "+customers.poll());
		
		System.out.println("Queue after serving: "+customers);
		
		System.out.println("Next Customer: "+customers.peek());
	}

}
