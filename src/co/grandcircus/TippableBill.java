package co.grandcircus;

public class TippableBill extends Bill {
	
	private double tip;

	public TippableBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public TippableBill(double tip) {
		super();
		this.tip = tip;
	}


	public TippableBill(double subTotal, double taxRate, double tip) {
		super(subTotal, taxRate);
		this.tip = tip;
	}


	@Override
	public double calcTotal() {
		return super.calcTotal() + tip;
	}

}
