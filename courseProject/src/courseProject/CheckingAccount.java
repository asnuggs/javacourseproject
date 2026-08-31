package courseProject;

public class CheckingAccount extends Account {
	public static final double SERVICE_FEE = 0.50;
	public static final double INTEREST_RATE = 0.02;
	public static final double OVERDRAFT_FEE = 30.00;
	
	@Override
	public void deposit(double amount) {
		setTransactionType("DEP");
		setTransactionAmount(amount);
		balance = balance + amount - SERVICE_FEE;
		lastFeeCharged = SERVICE_FEE;
	}
	
	@Override
	public void withdrawal(double amount) {
		setTransactionType("WTH");
		setTransactionAmount(amount);
		balance = balance - amount - SERVICE_FEE;
		lastFeeCharged = SERVICE_FEE;
		if (balance < 0) {
			balance = balance - OVERDRAFT_FEE;
			lastFeeCharged = SERVICE_FEE + OVERDRAFT_FEE;
		}
	}
	
	public double applyInterest() {
		double interest = balance * INTEREST_RATE;
		balance = balance + interest;
		return interest;
	}
}
