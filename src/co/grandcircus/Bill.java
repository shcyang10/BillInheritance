package co.grandcircus;

public class Bill {
	
	private double subTotal;
	private double taxRate;
	
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(double subTotal, double taxRate) {
		super();
		this.subTotal = subTotal;
		this.taxRate = taxRate;
	}
	
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double calcTotal() {
		return (subTotal*(1 + taxRate));
		
	}
}


