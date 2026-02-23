package conditionAndControl;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Creating the array
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] arr = new int[size];
		

		// Adding elements to array
		System.out.println("Enter the values for array");
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		// Print element of array
		System.out.println("The elements of the array: ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// Another way
		System.out.println("Another way to create array");
		
		int[] array = {1,2,3,4,5};
		// Print element of array
				System.out.println("The elements of the array: ");
				for(int i=0; i<array.length;i++) {
					System.out.println(array[i]);
				}
		
	}

}
