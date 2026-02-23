package conditionAndControl;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of array");
		for(int i=0; i<arr.length; i++) 
		{
		 	arr[i] = sc.nextInt();
		}

//		for(int num : arr){
//
//			System.out.println(num);
//		}
		

		// Count the elements
		
		System.out.println("Count = "+ arr.length);

		// Print even numbers
		System.out.println("Printing Even numbers");
		for(int i =0; i<arr.length; i++) {
			
			if(arr[i] %2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		// Sum of array
		
		System.out.println("Sum of array");
		int sum =0;
		
		for(int i =0; i<arr.length;i++) {
			
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		// Find maximum
		System.out.println("Find maximum");
		int max = arr[0];
		
		for(int i =0; i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
		
		// Reverse Array
		
		System.out.println("Array reverse");
		//int[] reverse = new int[size];
		
		for(int i= arr.length-1; i >=0; i--) {
			
			System.out.println(arr[i]);
		}
		
		// Find duplicates
		
		System.out.println("Find duplicates");
		for(int i =0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate: " +arr[i]);
				}
			}
		}
		
		// Remove Duplicates
		
		System.out.println("Remove Duplicates: ");
		int[] temp = new int[size];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			boolean isDuplicate = false;
			
			for(int j=0; j<index;j++) {
				if(arr[i]==temp[j]) {
					isDuplicate=true;
					break;
				}
			}
			
			if(!isDuplicate) {
				temp[index++] = arr[i];
			}
		}
		
		for(int num: temp) {
			System.out.println(num);
		}
	}

}
