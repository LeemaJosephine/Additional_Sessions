package orderManagement;

public interface Invoice {

	void generateInvoice();
}

class Order implements Invoice{
	
	// Initial Method
	public void placeOrder(String product_name) {
		System.out.println("Order placed!! " +product_name);
	}
	
	// Method overloading
	public void placeOrder(String product_name, double final_price) {
		System.out.println("Order placed!! " +product_name+" , " +final_price);
	}

	@Override
	public void generateInvoice() {
		// TODO Auto-generated method stub
		System.out.println("Invoice Generated Sucessfully");
	}
	
	
}

