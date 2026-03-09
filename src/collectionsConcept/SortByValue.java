package collectionsConcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("John", 85);
		marks.put("Alex", 92);
		marks.put("Mike", 75);
		marks.put("David", 90);
		
		// Convert map entries to list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(marks.entrySet());
		
		System.out.println(list);
		list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));  // Sorts in descending order
		
		for(Map.Entry<String, Integer> entry : list) {
			
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		//list.sort(Map.Entry.comparingByValue()); - ascending order
		
	
	}
}
