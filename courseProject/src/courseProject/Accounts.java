package courseProject;

public class Accounts {
	public String accountNumber;
	public String accountType;
	public double serviceFee;
	public double intrestRate;
	public double overdraftFee;
	public double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && accountNumber.length() > 5) {
			throw new IllegalArgumentException("Account Number can not be more than 5 characters.");
		} else if (accountNumber == null || accountNumber.isBlank()) {
			throw new IllegalArgumentException("Account Number can not be blank.");
		}
		this.accountNumber = accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		if (accountType.equalsIgnoreCase("CHK") || accountType.equalsIgnoreCase("SAV")) {
			this.accountType = accountType;
		}else {
			throw new IllegalArgumentException("Invalid account type");
		}
	}
	
	public double getServiceFee() {
		return serviceFee;
	}
	
	public void setServiceFee(double serviceFee) {
		if ( 0 > serviceFee || serviceFee > 10) {
			throw new IllegalArgumentException("Outside of service fee range.");
		} else {
			this.serviceFee = serviceFee;
		}
	}
	
	public double getIntrestRate() {
		return intrestRate;
	}
	
	public void setIntrestRate(double intrestRate) {
		if (0 > intrestRate || intrestRate >10) {
			throw new IllegalArgumentException("Outside of intrest rate range.");
		}
	}
	
	public double getOverdraftFee() {
		return overdraftFee;
	}
	
	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

