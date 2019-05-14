package java17;

public class BadBank extends Bank {	
	@Override
	public double getInterestRate() {
		double rate = 10.0;
		return rate;
	}
}
