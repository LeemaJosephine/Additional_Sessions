package collectionsConcept;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pages = new Stack<String>();
		
		// Push elements
		
		pages.push("Google");
		pages.push("YouTube");
		pages.push("Amazon");
		
		System.out.println("Stack: "+pages);
		
		// pop element
		System.out.println("Back to: "+pages.pop());
		
		System.out.println("Current Stack: "+pages);
		
		// peek element
		System.out.println("Current Page: "+pages.peek());
		
		System.out.println(pages.isEmpty());
	}

}
