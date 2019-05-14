package java17;

public class BankUser {
	public static void main(String[] args) {
		BadBank bb = new BadBank();
		NormalBank nb = new NormalBank();
		GoodBank gb = new GoodBank();
		
		System.out.println("BadBank : " + bb.getInterestRate());
		System.out.println("NormalBank : " + nb.getInterestRate());
		System.out.println("GoodBank : " + gb.getInterestRate());
	}
}
