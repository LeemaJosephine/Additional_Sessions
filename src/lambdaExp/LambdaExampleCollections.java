package lambdaExp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LambdaExampleCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10,20,30,40);
		
		numbers.forEach(n -> System.out.println(n));
		
		numbers.stream()
			.filter(n -> n > 20)
			.forEach(System.out::println);
		
	}

}
