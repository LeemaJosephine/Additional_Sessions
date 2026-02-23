package conditionAndControl;

import java.util.Scanner;

public class PracticeSwitch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value from 1 - 3");
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		
		case 2: 
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		default:
			System.out.println("Invalid number");
		}
	}
}
