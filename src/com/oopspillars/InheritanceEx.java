package com.oopspillars;



class Bank{
	double roi;
	double amount;
	void calculateAmoutWithRoi(double amount) {
		double finalAmpount = amount+(amount/100)*roi;
		System.out.println("Final amount is: "+finalAmpount);
	}
}
class Hdfc extends Bank{
	double amount;
	void calculateAmountWithRoi(double amount) {
		this.amount = amount;
		super.roi=7.5;
		super.calculateAmoutWithRoi(amount);

	}


}
class Icici extends Bank{
	double amount;
	void calculateAmount(double amount) {
		this.amount = amount;
		super.roi=8.5;
		super.calculateAmoutWithRoi(amount);

	}

}

public class InheritanceEx {

	public static void main(String[] args) {

		Hdfc hdfc = new Hdfc();
		hdfc.calculateAmountWithRoi(100000);

		Icici icici = new Icici(); 
		icici.calculateAmount(100000);

	}

}
