package lambdaExp;

import java.util.ArrayList;
import java.util.List;

class TestCase{
	
	String name;
	String status;
	
	TestCase(String name,String status){
		this.name=name;
		this.status=status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return name + " : " + status;
	}
	
}

public class LambdaTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<TestCase> tests = new ArrayList<>();
		
		tests.add(new TestCase("LoginTest", "Pass"));
		tests.add(new TestCase("CheckOut", "Fail"));
		tests.add(new TestCase("SearchTest", "Pass"));
		
		tests.stream()
			.filter(t -> t.getStatus().equals("Fail"))
			.forEach(System.out::println);  // Java internally calls println(t.toString());
		
	}

}
