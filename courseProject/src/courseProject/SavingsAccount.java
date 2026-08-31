package courseProject;

public class SavingsAccount extends Account {
	public static final double SERVICE_FEE = 0.25;
	public static final double INTEREST_RATE = 0.05;
	
	@Override
	public void deposit(double amount) {
		setTransactionType("DEP");
		setTransactionAmount(amount);
		balance = balance + amount - SERVICE_FEE;
		lastFeeCharged = SERVICE_FEE;
	}
	
	@Override
	public void withdrawal(double amount) {
		if (amount + SERVICE_FEE > balance) {
			throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
		}
		setTransactionType("WTH");
		setTransactionAmount(amount);
		balance = balance - amount - SERVICE_FEE;
		lastFeeCharged = SERVICE_FEE;
	}
	
	public double applyInterest() {
		double interest = balance * INTEREST_RATE;
		balance = balance + interest;
		return interest;
	}
}
