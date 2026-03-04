package orderManagement;

public abstract class Payment {

	abstract void pay(double amount);
	
	public void normalMethod() {
		System.out.println("Normal method inside abstract");
	}
}

class UPI extends Payment{

	@Override
	void pay(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Paid using UPI!!!" +amount);
		
	}	
}

class CreditCard extends Payment{

	@Override
	void pay(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Paid using Credit Card!!!" +amount);
		
	}
	
	
}

