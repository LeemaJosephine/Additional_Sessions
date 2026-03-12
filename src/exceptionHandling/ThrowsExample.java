package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void readFile() throws IOException {
		
		FileReader file = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(file);
		System.out.println(br.readLine());
		
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("Check the file path");
		}
		
	}

}
