package exceptionHandling;

import java.util.Scanner;

public class TryCatchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0;
		int[] arr= {1,2,3,4};
		String name=null;
		
		try {
			
		c = a/b;
		System.out.println("Element of arr[1]: "+arr[1]);
		System.out.println(name.length());
		
		} catch (ArithmeticException e) {
			System.out.println("You entered 0, hence nothing executed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check the index");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(c);
	}

}
