package collectionsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Object> emails = new HashSet<Object>();
		
		// Add elements
		
		emails.add("user@gmail.com");
		emails.add("test@gmail.com");
		emails.add("admin@gmail.com");
		emails.add("user@gmail.com");
		emails.add("testuser@gmai.com");
		emails.add(101);
		emails.add(102);
		
		
		System.out.println("Unique Emails");
		System.out.println("***********************");
		
		for(Object email : emails) {
			System.out.println(email);
		}
		
		System.out.println();
		System.out.println("Total Unique emails: "+emails.size());
		
		System.out.println();
		
		//  Convert set to list
		
		System.out.println("Converting Set to List");
		System.out.println("***********************");
		ArrayList<Object> list = new ArrayList<Object>(emails);
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println("Linked Hash Set");
		System.out.println("***********************");
		
		Set<Object> email = new LinkedHashSet<Object>();
		
		// Add elements
		
		email.add("user@gmail.com");
		email.add("test@gmail.com");
		email.add("admin@gmail.com");
		email.add("user@gmail.com");
		email.add("testuser@gmai.com");
		email.add(101);
		email.add(102);
		
		for(Object mail : email) {
			System.out.println(mail);
		}
		
		System.out.println();
		System.out.println("Total Unique emails: "+email.size());
		
		System.out.println();
		System.out.println("TreeSet");
		System.out.println("*******");
		
		Set<String> ids = new TreeSet<String>();
		
		// Add elements
		
		ids.add("user@gmail.com");
		ids.add("test@gmail.com");
		ids.add("admin@gmail.com");
		ids.add("user@gmail.com");
		ids.add("testuser@gmai.com");
	
		
		for(String id : ids) {
			System.out.println(id);
		}
		
		System.out.println();
		System.out.println("Total Unique emails: "+ids.size());
		
		
	}
	

}
