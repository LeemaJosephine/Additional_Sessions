package collectionsConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> products = new HashMap<String, Integer>();
		
		products.put("Laptop", 55000);
		products.put("Mobile", 25000);
		products.put("Headphones", 2000);
		products.put("Keyboard", 1500);
		
		System.out.println("Product Prices");

		for(Map.Entry<String, Integer> entry : products.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("Price of Laptop: "+products.get("Laptop"));
		
		products.put("Keyboard", 1800);
		
		System.out.println("Updated Keyboard Price: " +products.get("Keyboard"));
	}

}
