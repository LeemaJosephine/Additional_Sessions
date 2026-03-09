package collectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step: 1 - List (Store all products)
		List<String> products = new ArrayList<String>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Laptop");
		products.add("Monitor");
		products.add("Keyboard");
		products.add("Mouse");
		
		System.out.println("All Products: ");
		for(int i=0; i<products.size();i++) {
			System.out.print(products.get(i)+" ");
		}
		
		// Step: 2 - Set (Find unique Products)
		Set<String> uniqueProducts = new HashSet<String>(products);
		
		System.out.println("\nUnique Products: ");
		
		for(String unique : uniqueProducts) {
			
			System.out.print(unique+" ");
		}
		
		// Step: 3 - Map (Count occurrence)
		
		Map<String, Integer> productCount = new HashMap<String, Integer>();
		
		for(String product : products) {
			
			if(productCount.containsKey(product)) {
				productCount.put(product, productCount.get(product) + 1);
			} else {
				productCount.put(product, 1);
			}
		}
		
		System.out.println("\nProduct Count: ");
		
		for(String key : productCount.keySet()) {
			
			System.out.println(key + " : "+ productCount.get(key));
		}
	}

}
