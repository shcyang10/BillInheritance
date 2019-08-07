package co.grandcircus;

public class RestaurantApp {

	public static void main(String[] args) {
		
		Bill n = new Bill(15.80, 0.06);
		pay(n);
		
		TippableBill addTip = new TippableBill(8.50, 0.06, 2.00);
		
		pay(addTip);

	}
	
	public static void pay(Bill n) {
		System.out.println("$" + n.calcTotal());
	}

}
