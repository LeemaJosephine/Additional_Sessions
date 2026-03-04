package orderManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ORDER MANAGEMENT SYSTEM");
		System.out.println("************************");
		
		System.out.println("Enter the product id: ");
		int id_elec = sc.nextInt();
		System.out.println("Enter the Electornic product name: ");
		String name_elec = sc.next();
		System.out.println("Enter the Electronic product price ");
		double price_elec= sc.nextDouble();
		System.out.println("Enter the Warranty ");
		int warranty= sc.nextInt();
		
		System.out.println("Enter the product id: ");
		int id_cloth = sc.nextInt();
		System.out.println("Enter the Clothing product name: ");
		String name_cloth = sc.next();
		System.out.println("Enter the Clothing product price ");
		double price_cloth= sc.nextDouble();
		System.out.println("Enter the Size ");
		int size= sc.nextInt();
		
		// Object creation
		
		//Product p1 = new Product(id,name); // Parameterized constructor
		Product p2 = new ElectronicProduct(id_elec, name_elec, warranty);
		p2.setProduct(price_elec); // Encapsulation method
		String result = p2.displayProduct(); // Method with return type
		System.out.println(result);
		double final_Price=p2.calculateDiscount(price_elec);
		System.out.println("Final price after discount is: "+final_Price);
		UPI pay = new UPI();
		pay.pay(final_Price);
		Order p4 = new Order();
		p4.placeOrder(name_elec);
		p4.generateInvoice();
		
		
		Product p3 = new ClothingProduct(id_cloth, name_cloth, size);
		p3.setProduct(price_cloth);
		String res = p3.displayProduct();
		System.out.println(res);
		double final_price=p3.calculateDiscount(price_cloth);
		System.out.println("Final price after discount is: "+final_price);
		CreditCard credit = new CreditCard();
		credit.pay(final_price);
		p4.placeOrder(name_cloth, final_price);
		p4.generateInvoice();
		
	}
}
