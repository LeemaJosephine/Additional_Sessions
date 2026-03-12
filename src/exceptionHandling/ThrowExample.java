package exceptionHandling;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int age=sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			throw new ArithmeticException("Not eligible to vote");
		}
	}

}
