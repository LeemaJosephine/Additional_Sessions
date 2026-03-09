package collectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(78);
		marks.add(85);
		marks.add(90);
		marks.add(67);
		marks.add(85);
		marks.add(92);
		marks.add(74);
		marks.add(88);
		
		// Display the List
		
		System.out.println("Students Marks: ");
		
		for(int i=0; i<marks.size(); i++) {  // return the size of the list
			System.out.print(marks.get(i)+" ");  // get -> to take each value from the list
		}
		System.out.println();
		
		//Highest Mark
		
		int max = Collections.max(marks);
		System.out.println("Highest mark: "+max);
		
		// Count marks above 80
		
		int sum=0;
		int count =0;
		
		for(int mark: marks) {
			
			sum += mark;  // to find avg marks
			
			if(mark > 80) {  // to find marks above 80
				count++;
			}
		}
		
		double avg = (double) sum/marks.size();
		
		System.out.println("Average mark: ");
		System.out.printf("%.2f",avg);
		System.out.println();
		System.out.println("Student scoring above 80: "+count);
		
	}
}
