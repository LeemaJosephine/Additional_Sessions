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

}

class ElectronicProduct extends Product{

	int warranty;
	
	public ElectronicProduct(int id, String name, int warranty) {
		super(id,name);
		this.warranty=warranty;
	}
}

class ClothingProduct extends Product{

	int size;
	
	public ClothingProduct(int id, String name, int size) {
		super(id,name);
		this.size=size;
	}
}

