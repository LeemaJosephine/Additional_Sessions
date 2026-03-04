package orderManagement;

public class Product {

	private int id;
	private String name;
	private double price;
	
	// Constructor
	public Product(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	
	// Encapsulation setter method
	
	public void setProduct(double price) {
		
		this.price=price;
		
	}
	
	// Method with return type
	public String displayProduct() {
		
		return id + " " + name + " Rs. " + price;
	}
	
	// Method overriding
	public double calculateDiscount(double price) {
		// TODO Auto-generated method stub
		System.out.println("No Discount");
		return price;
	}
	

}

class ElectronicProduct extends Product{

	int warranty;
	
	public ElectronicProduct(int id, String name, int warranty) {
		super(id,name);
		this.warranty=warranty;
	}
	
	@Override
	public double calculateDiscount(double price) {
		double discount =price * 0.10;
		double final_Price = price - discount;
		System.out.println("10% discount on electronics");
		
		return final_Price;
	}
	
	
}

class ClothingProduct extends Product{

	int size;
	
	public ClothingProduct(int id, String name, int size) {
		super(id,name);
		this.size=size;
	}
	
	@Override
	public double calculateDiscount(double price) {
		
		double discount =price * 0.20;
		double final_Price = price - discount;
		System.out.println("20% discount on Clothing");
		
		return final_Price;
	}
}

