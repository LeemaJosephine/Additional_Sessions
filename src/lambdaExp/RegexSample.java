package lambdaExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		
		// Using matches
		String pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$";
		
		if(email.matches(pattern)) {
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email");
		}
		
		// Using Pattern and Matcher
		
		// Check for digits in input
		
		String text ="Order123";
		
		Pattern pat = Pattern.compile("\\d+"); // defines regex exp
		
		Matcher matcher = pat.matcher(text); // applies regex
		
		while(matcher.find()) { // search
			System.out.println(matcher.group()); // extract
		} 
		
		
		// Validate Mobile number
		
		String mobile = "9876543210";
		
		String pattNum = "\\d{10}";
		
		if(mobile.matches(pattNum)) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid number");
		}
		
		// Validate Password
		
		// Conditions: At least 8 characters, 1 uppercase, 1 lowercase, 1 digit
		// ?= - condition , .* - at least 1
		
		String password ="Test.123";
		String patPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*+=!.]).{8,}$";
		
		if(password.matches(patPass)) {
			System.out.println("Strong password");
		} else {
			System.out.println("Reset password");
		}
	
		// Extract Emails from Text
		
		String welcomMsg ="Welcome testuser@gmail.com to the website";
		
		Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
		
		Matcher m = p.matcher(welcomMsg);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		// Replace number with X
		
		String sampleText = "Order123 Amount456";
		
		String result = sampleText.replaceAll("\\d+", "X");
		
		System.out.println(result);
	}

}


