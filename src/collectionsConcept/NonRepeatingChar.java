package collectionsConcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "selenium";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println("First Non-repeating character: "+ entry.getKey());
				break;
			}
		}
	}

}
