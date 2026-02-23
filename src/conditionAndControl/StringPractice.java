package conditionAndControl;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
//		// Count Characters
//		
//		System.out.println(str.length());
//		
//		// Count vowels
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			
//			char ch = str.charAt(i);
//			char c = Character.toLowerCase(ch);
//			if(c=='a' || c =='e' || c =='i' || c=='o' || c=='u') {
//				count++;
//			}
//		}
//		
//		System.out.println("Vowels: "+count);
//		
//		// Reverse a String
//		
//		String rev="";
//		
//		for(int i=str.length()-1; i>=0;i--) {
//			
//			rev += str.charAt(i);
//		}
//		
//		System.out.println("Reversed: "+ rev);
//		
//		// Palindrome
//		
//		if(str.equals(rev)) {   // A .equals()
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not a Plindrome");
//		}
//		
//		// Count words
//		System.out.println("Count words");
//		String str1 ="I Love Java";
//		
//		String[] words=str1.split(" ");
//		
//		System.out.println(words.length);
//		
//		// Remove Space
//		
//		System.out.println("Remove Space");
//		String value="hello world";
//		String result="";
//		
//		for(char c : value.toCharArray()) {
//			if(c != ' ') {
//				result += c;
//			}
//		}
//		
//		System.out.println(result);
//		
		
		// Character Frequency
		
		System.out.println("Character Frequency");
		for(int i=0; i<str.length();i++) {
			int flag=0;
			char ch = str.charAt(i);
			
			boolean alreadyVisited= false;
			for(int k=0; k<i;k++) {
				if(ch == str.charAt(k)) {
					alreadyVisited= true;
					break;
				}
			}
			// aut
			
			if(alreadyVisited) {
				continue;
			}
			
			//Count frequency
			for(int j=0; j<str.length();j++) {
				if(ch == str.charAt(j)) {
					flag++;
				}
			}
			
			System.out.println(ch + "=" + flag + " ");
		}
		
		
		// Email Validation
		
		String email ="user@gmail.com";
		
		if(email.contains("@") && email.contains(".com")) {
			
			System.out.println("Valid mail id");
		} else {
			
			System.out.println("Invalid maid id");
		}
		
		// Extract username
		
		String username = email.substring(0, email.indexOf('@'));
		System.out.println(username);
		
		// Password Validation
		
		String password ="admi123";
		
		boolean hasUpper=false, hasDigit=false;
		
		for(char ch : password.toCharArray()) {
			
			if(Character.isUpperCase(ch)) hasUpper=true;
			if(Character.isDigit(ch)) hasDigit=true;
		}
		
		if(password.length()>=8 && hasUpper && hasDigit) {
			
			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
		}
	}

}
