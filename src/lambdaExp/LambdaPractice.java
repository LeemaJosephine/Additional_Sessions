package lambdaExp;

interface Add {
	int sum(int a, int b);
}

public class LambdaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syntax
		// (parameter) -> expression
		// E.g: (a,b) -> a + b
		
		// Without Lamba Exp
//		Add obj = new Add() {
//			
//			@Override
//			public int sum(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//		};
		
		// With Lambda
		
		Add obj = (a,b) -> a + b;
		System.out.println(obj.sum(5, 10));
	}

}
