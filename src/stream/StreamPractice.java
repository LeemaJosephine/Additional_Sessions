package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Without Stream
		System.out.println("Without Stream");
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		
		for(int n: numbers) {
			
			if(n > 20) {
				System.out.println(n);
			}
		}
		
		System.out.println();
		System.out.println("With Stream - Filter");
		
		// With Stream
		numbers.stream()  // Converts List into a Stream
			.filter(n -> n > 20)   // for each number n check if n > 20
			.forEach(x -> System.out.println(x)); // for each number x , print x
		
		System.out.println();
		System.out.println("Map");
		
		// Map - used to transform data
		
		List<String> users = Arrays.asList("john","rob","bob");
		
		users.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		System.out.println("Number Square using map");
		numbers.stream()
			.map(n -> n * n)
			.forEach(System.out::println);
		
		// Collect() - used to store result
		
		List<Integer> result = numbers.stream()
			.filter(n -> n > 10)
			.collect(Collectors.toList());
		
		System.out.println(result);
		
		// Filtering Emails
		
		List<String> emails = Arrays.asList("test@gamil.com","invalid-email","test@","user@yahoo.com");
		
		emails.stream()
			.filter(e -> e.contains("@"))
			.forEach(System.out::println);
	}

}
